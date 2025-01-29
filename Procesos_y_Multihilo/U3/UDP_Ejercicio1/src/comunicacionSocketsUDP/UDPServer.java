package comunicacionSocketsUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket socket;
		try {
			System.out.println("(Servidor) Creando socket...");
			socket = new DatagramSocket(49171);
			System.out.println("(Servidor) Recibiendo datragrama...");
			byte[] bufferLectura = new byte[64];
			DatagramPacket datagramaEntrada = new DatagramPacket(bufferLectura,bufferLectura.length);
			socket.receive(datagramaEntrada);

			String mensajeEntrada = new String(datagramaEntrada.getData(), 0, datagramaEntrada.getLength());
            String[] partesMensaje = mensajeEntrada.split(",");
			int edad = Integer.parseInt(partesMensaje[0].trim());
			String nombre = partesMensaje[1].trim();

            String mensajeSalida = "";
            if (edad >= 18) {
                mensajeSalida = "Hola " + nombre + " eres mayor de edad.";
            } else {
                mensajeSalida = "Hola " + nombre + " eres menor de edad.";
            }
            byte[] bufferSalida = mensajeSalida.getBytes();
            DatagramPacket datagramaSalida = new DatagramPacket(bufferSalida, bufferSalida.length,
                    datagramaEntrada.getAddress(), datagramaEntrada.getPort());
            socket.send(datagramaSalida);
            System.out.println("(Servidor) Mensaje enviado: " + mensajeSalida);
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
