package comunicacionSockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Cliente {
	private String serverIP;
	private int serverPort;
	private Socket socket;
	private InputStream in;
	private OutputStream ou;
	
	public TCP_Cliente(String serverIP, int serverPort) {
		this.serverIP = serverIP;
		this.serverPort = serverPort;
	}
	
	public void start () throws UnknownHostException, IOException {
		System.out.println( "(Cliente) Estableciendo conexión...");
		socket = new Socket();
		InetSocketAddress addr = new InetSocketAddress("localhost",49171);
		socket.connect(addr);
		ou = socket.getOutputStream();
		in = socket.getInputStream();
		System.out.println("(Cliente) Conexión establecida...");
	}
	
	public void stop () throws IOException {
		System.out.println( "(Cliente) Cerrando conexiones...");
		in.close();
		ou.close();
		socket.close();
		System.out.println( "(Cliente) Conexiones cerradas...");
	}
	
	public static void main(String[] args) {
		TCP_Cliente cliente = new TCP_Cliente("localhost", 49171);
		try {
            cliente.start();
            // Envía la edad al servidor
            cliente.ou.write(26); 

			// Envía el nombre al servidor
			String nombre = "Alejandra";
			cliente.ou.write(nombre.getBytes());

            // Lee la respuesta del servidor y la imprime
            byte[] buffer = new byte[100]; 
            int bytesRead = cliente.in.read(buffer);
            String mensaje = new String(buffer, 0, bytesRead);
            
			System.out.println("Respuesta del servidor: " + " El cliente se llama " + nombre + " y es " + mensaje);
            
			cliente.stop();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	

}
