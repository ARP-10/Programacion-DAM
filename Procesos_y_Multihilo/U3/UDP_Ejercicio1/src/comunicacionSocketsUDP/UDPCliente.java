package comunicacionSocketsUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPCliente {

	public static void main(String[] args) {
		int edad = 26; 
		String nombre = "Alejandra";
        DatagramSocket socketUDP;
        try {
            System.out.println("(Cliente) Estableciendo parámetros de conexión...");
            InetAddress hostServidor = InetAddress.getByName("localhost");
            int puertoServidor = 49171;
            System.out.println("(Cliente) Creando socket...");
            socketUDP = new DatagramSocket();

            String mensaje = String.valueOf(edad + "," + nombre);
			
            byte[] buffer = mensaje.getBytes();
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length, hostServidor, puertoServidor);
            socketUDP.send(peticion);
            System.out.println("(Cliente) Enviando datos al servidor...");
            byte[] bufferRespuesta = new byte[64];
            DatagramPacket respuesta = new DatagramPacket(bufferRespuesta, bufferRespuesta.length);
            socketUDP.receive(respuesta);
            String mensajeRespuesta = new String(respuesta.getData(), 0, respuesta.getLength());
            System.out.println("(Cliente) Mensaje recibido del servidor: " + mensajeRespuesta);
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
