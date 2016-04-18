package prjava02;
import java.io.*;
import java.net.*;
public class Prjava02 {
	public static void main(String[] args) {
		System.out.println("Afegint més codi a la branca00 del projecte prjava02");
        try {  
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió  OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) {
        }  
    }
}
