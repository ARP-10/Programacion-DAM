package comunicacionSocketsUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class socketUDPCliente {

	public static void main(String[] args) {
		String strMensaje = "Mensaje enviado desde el cliente";
		DatagramSocket socketUDP; // Objeto para la comunicación
		try {
			// Marcamos el puerto de comunicación
			System.out.println("Cliente): Estableciendo parámetros de conexión...");
			InetAddress hostServidor = InetAddress.getByName("localhost");
			int puertoServidor = 49171;

			// Creamos un nuevo socket
			System.out.println("(Cliente) Creando socket...");
			socketUDP = new DatagramSocket();

			// Se convierte el mensaje a bytes
			System.out.println("(Cliente) Enviando datagrama...");
			byte[] mensaje = strMensaje.getBytes();

			// Se crea un objeto para guardar el mensaje
			DatagramPacket peticion = new DatagramPacket(mensaje,mensaje.length,hostServidor,puertoServidor);
			
			// Se envía el datagrama al servidor
			socketUDP.send(peticion);

			// Se recibe la respuesta
			System.out.println("(Cliente) Recibiendo datagrama...");
			byte[] buffer = new byte[64];
			DatagramPacket respuesta = new DatagramPacket(buffer,buffer.length,hostServidor,puertoServidor);
			socketUDP.receive(respuesta);

			// Se imprime el mensaje
			System.out.println("(Cliente) Mensaje recibido: "+new String(buffer));
			System.out.println("(Cliente) Cerrando socket...");
			socketUDP.close();
			System.out.println("(Cliente) Socket cerrado...");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
