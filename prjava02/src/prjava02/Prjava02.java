package prjava02;
import java.io.*;
import java.net.*;
public class Prjava02 {
	public static void main(String[] args) {
		System.out.println("Conflicte t�pic: Codi diferent a la mateixa l�nia");
		System.out.println("Conflicte t�pic: Codi diferent a la mateixa l�nia");
        try {
            InetAddress adre�a = InetAddress.getLocalHost();
            String hostname = adre�a.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versi�  OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) {
        }  
    }
}
