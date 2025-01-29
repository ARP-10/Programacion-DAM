package comunicacionSockets;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
    private Socket socket;
    private InputStream in;
    private OutputStream out;
    private BufferedReader reader;
    private PrintWriter writer;

    // Constructor para inicializar el cliente y establecer la conexión con el servidor
    public Cliente(String serverIP, int serverPort) {
        try {
            socket = new Socket();
            InetSocketAddress addr = new InetSocketAddress(serverIP, serverPort);
            socket.connect(addr);
            in = socket.getInputStream();
            out = socket.getOutputStream();
            reader = new BufferedReader(new InputStreamReader(in));
            writer = new PrintWriter(out, true);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para iniciar la comunicación con el servidor
    public void start() {
        try {
            System.out.println("(Cliente) Conexión establecida...");
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            // Solicitar al usuario que ingrese su nombre y enviarlo al servidor
            System.out.print("Ingrese su nombre: ");
            String clientName = consoleReader.readLine().trim();
            writer.println(clientName);

            while (true) {
                // Mostrar el menú de opciones
                printMenu();
                String option = consoleReader.readLine().trim();
                writer.println(option);
                
                switch (option) {
                    // Solicitar al usuario que ingrese un número y enviarlo al servidor
                    case "1":
                        System.out.print("Ingrese un número: ");
                        int number = Integer.parseInt(consoleReader.readLine().trim());
                        writer.println(number);
                        writer.println(clientName);
                        System.out.println(reader.readLine());
                        break;

                    // Mostrar la lista de números almacenados enviada por el servidor
                    case "2":
                        System.out.println("Lista de números almacenados: " + reader.readLine());
                        break;

                    // Solicitar al servidor la cantidad de números almacenados hasta el momento
                    case "3":
                        System.out.println("Solicitando cantidad de números almacenados hasta el momento...");
                        System.out.println("Cantidad de números almacenados hasta el momento: " + reader.readLine());
                        break;

                    // Solicitar al usuario que ingrese el nombre de un cliente y mostrar la cantidad de números que ha almacenado
                    case "4":
                        System.out.print("Ingrese el nombre del cliente: ");
                        String clientCountName = consoleReader.readLine().trim();
                        writer.println(clientCountName);
                        System.out.println("Cantidad de números almacenados por " + clientCountName + ": " + reader.readLine());
                        break;
                    
                    // Solicitar al usuario su nombre y enviarlo al servidor para guardar sus números en un archivo
                    case "5":
                        System.out.print("Ingrese su nombre para guardar sus números: ");
                        String clientFileName = consoleReader.readLine().trim();
                        writer.println(clientFileName);
                        System.out.println(reader.readLine());
                        break;
                    case "6":
                        socket.close();
                        System.out.println("Conexiones cerradas.");
                        return;
                    default:
                        System.out.println(reader.readLine());
                        break;
                }
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para imprimir el menú de opciones
    private void printMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Almacenar un número");
        System.out.println("2. Lista de números almacenados");
        System.out.println("3. Cantidad de números almacenados hasta el momento");
        System.out.println("4. Cantidad de números almacenados por un cliente");
        System.out.println("5. Guardar sus números en un archivo");
        System.out.println("6. Salir");
        System.out.print("Ingrese la opción: ");
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("localhost", 49171);
        cliente.start();
    }
}
