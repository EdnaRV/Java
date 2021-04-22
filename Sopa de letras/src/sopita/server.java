package sopita;
import java.net.*;
import java.io.*;
public class server {
	public static void main(String[] args) {
		try
		{
			int pto = 8000;
			DatagramSocket s = new DatagramSocket(8000);
			s.setReuseAddress(true);
			System.out.println("servidor inicado, esperando mensaje");
			for (;;)
			{
				DatagramPacket p = new DatagramPacket(new byte[65535], 65535);
				s.receive(p);
				String cadena = new String(p.getData(), 0, p.getLength());
				String resp = "Mensaje recibido" + cadena + "en el servidor";
				byte[] b = resp.getBytes();
				System.out.println("Hola usuario!" + p.getAddress() + ":" + p.getPort());
				DatagramPacket p1 = new DatagramPacket(b, b.length, p.getAddress(), p.getPort());
				s.send(p1);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}