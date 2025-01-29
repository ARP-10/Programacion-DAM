package comunicacionSocketsUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class socketUDPServer {

	public static void main(String[] args) {
		DatagramSocket socket;
		try {
			// Elegimos un puerto para la comunicación
			System.out.println("(Servidor) Creando socket...");
			socket = new DatagramSocket(49171);

			System.out.println("(Servidor) Recibiendo datragrama...");

			// Creamos un buffer para almacenar datos
			byte[] bufferLectura = new byte[64];
			DatagramPacket datagramaEntrada = new DatagramPacket(bufferLectura,bufferLectura.length);
			
			// Cuando llegue el datagrama se guardará en "datagramaEntrada"
			socket.receive(datagramaEntrada);

			// Se imprime el mensaje
			System.out.println("(Servidor) Mensaje recibido: "+ new String(bufferLectura));
			
			// Se prepara el mensaje de respuesta
			System.out.println("(Servidor) Enviando datagrama...");
			byte[] mensajeEnviado = new String("Mensaje enviado desde el servidor").getBytes();
			
			// 
			DatagramPacket datagramaSalida = new DatagramPacket(mensajeEnviado, mensajeEnviado.length,datagramaEntrada.getAddress(),datagramaEntrada.getPort());
			
			// Se envía el datagrama de respuesta
			socket.send(datagramaSalida);
			System.out.println("(Servidor) Cerrando socket...");
			socket.close();
			System.out.println("(Servidor) Socket cerrado...");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
