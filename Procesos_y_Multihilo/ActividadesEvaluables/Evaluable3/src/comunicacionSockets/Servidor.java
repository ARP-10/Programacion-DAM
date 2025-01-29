package comunicacionSockets;

import java.io.*;
import java.net.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Servidor {
    private ServerSocket serverSocket;
    private Lock fileLock = new ReentrantLock();

    // Constructor para inicializar el servidor 
    public Servidor(int puerto) throws IOException {
        serverSocket = new ServerSocket(puerto);
    }

    public void start() throws IOException {
        System.out.println("(Servidor) Esperando conexiones...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("(Servidor) Conexión establecida...");

            // Crear un hilo para manejar cada conexión 
            Thread thread = new Thread(new ClientHandler(socket));
            thread.start();
        }
    }

    // Clase interna para manejar cada cliente en un hilo separado
    private class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;

        public ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            InputStream inputStream = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(socket.getOutputStream(), true);
        }

        @Override
        public void run() {
            try {
                // Lee el nombre del cliente
                String clientName = reader.readLine();

                while (true) {
                    // Lee la opción seleccionada
                    String option = reader.readLine();

                    switch (option) {
                        // Almacenar un número enviado por el cliente
                        case "1":
                            int number = Integer.parseInt(reader.readLine());
                            clientName = reader.readLine();
                            saveNumber(clientName, number);
                            writer.println("Número almacenado correctamente.");
                            break;
                        
                        // Enviar la lista de números almacenados al cliente
                        case "2":
                            writer.println(getNumberList());
                            break;

                        // Enviar el total de números almacenados al cliente
                        case "3":
                            writer.println(getTotalCount());
                            break;

                        // Enviar al cliente la cantidad de números almacenados por un cliente específico
                        case "4":
                            String clientCountName = reader.readLine();
                            writer.println(getClientCount(clientCountName));
                            break;

                        // Guardar los números de un cliente en un archivo
                        case "5":
                            String clientFileName = reader.readLine();
                            saveClientNumbers(clientFileName);
                            writer.println("Números guardados en " + clientFileName + "_numbers.txt");
                            break;
                        case "6":
                            socket.close();
                            return;
                        default:
                            writer.println("Opción no válida.");
                            break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Método para guardar un número en el archivo 'numeros.txt'
        private void saveNumber(String clientName, int number) {
            fileLock.lock();
            try (PrintWriter fileWriter = new PrintWriter(new FileWriter("numeros.txt", true))) {
                fileWriter.println(clientName + ": " + number);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
        }

        // Método para obtener el total de números almacenados
        private int getTotalCount() {
            int totalCount = 0;
            fileLock.lock();
            try (BufferedReader fileReader = new BufferedReader(new FileReader("numeros.txt"))) {
                while (fileReader.readLine() != null) {
                    totalCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
            return totalCount;
        }
        
        // Método para obtener la lista de números almacenados
        private String getNumberList() {
            StringBuilder result = new StringBuilder();
            fileLock.lock();
            try (BufferedReader fileReader = new BufferedReader(new FileReader("numeros.txt"))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    result.append(line).append(", ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
            return result.toString();
        }

        // Método para obtener la cantidad de números almacenados por un cliente específico
        private int getClientCount(String clientName) {
            int count = 0;
            fileLock.lock();
            try (BufferedReader fileReader = new BufferedReader(new FileReader("numeros.txt"))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    if (line.startsWith(clientName + ":")) {
                        count++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
            return count;
        }

        // Método para guardar los números de un cliente en un archivo separado
        private void saveClientNumbers(String clientName) {
            fileLock.lock();
            try (BufferedReader fileReader = new BufferedReader(new FileReader("numeros.txt"));
                 PrintWriter fileWriter = new PrintWriter(new FileWriter(clientName + "_numbers.txt"))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    if (line.startsWith(clientName)) {
                        fileWriter.println(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Servidor server = new Servidor(49171);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

