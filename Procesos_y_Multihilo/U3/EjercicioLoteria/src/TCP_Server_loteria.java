import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server_loteria {
	private ServerSocket serverSocket; 
	private Socket socket; 
	private InputStream is;
	private OutputStream ou;
	
	public TCP_Server_loteria(int puerto) throws IOException {
		serverSocket = new ServerSocket();
		InetSocketAddress direccion = new InetSocketAddress("localhost", puerto);
		serverSocket.bind(direccion);
	}
	
	public void start() throws IOException {
		System.out.println("(Servidor) Esperando conexiones...");
		socket = serverSocket.accept();
		is = socket.getInputStream();
		ou = socket.getOutputStream();
		System.out.println("(Servidor) Conexión establecida...");
	}
	
	public void stop() throws IOException {
		System.out.println("(Servidor) Cerrando conexiones...");
		is.close();
		ou.close();
		socket.close();
		serverSocket.close();
		System.out.println("(Servidor) Conexión cerrada...");
	}

	public static void main(String[] args) {
		try{
			TCP_Server_loteria servidor = new TCP_Server_loteria(49171);
			servidor.start();

			// Leemos 
			int numeroLoteria = servidor.is.read();
			System.out.println("El número premiado es: " + numeroLoteria);

			// Leemos el nombre del cliente
			/* 
			byte[] nombreBuffer = new byte[100];
			int nombreLength = servidor.is.read(nombreBuffer);
			String nombre = new String(nombreBuffer, 0, nombreLength);
			System.out.println("Nombre del cliente: " + nombre);*/

			// Comprueba si es mayor o menor de edad y envía respuesta
			/* 
			if (edad >= 18) {
				servidor.ou.write("mayor de edad".getBytes());
			} else {
				servidor.ou.write("menor de edad".getBytes());
			}*/

			servidor.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
