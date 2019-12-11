package inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******server*******");
		ServerSocket serverSocket=null;
		int port=1234;
		int nbr=0;
		try {
			serverSocket=new ServerSocket(port);
			System.out.println("SERVEUR: Ok sur le port= "+port);
			
		}catch (IOException ex) {
			// TODO: handle exception
			System.out.println("SERVEUR: impossible creer le serveur avec le port");
		}
		while(true) {
			Socket clientSocket=null;
			try {
				System.out.println("SERVEUR;j'attent un client..");
				clientSocket=serverSocket.accept();
				nbr++;
				System.out.println("Clients: "+nbr);
				//processClientRequest(clientSocket);
			    (new Thread(new ClientWorker(clientSocket))).start();
			}catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error: cannot accept client request");
				return;
			}
		}
	}
	/*public static void processClientRequest(Socket clientSocket) throws InterruptedException{
		try {
			PrintStream printStream=new PrintStream(clientSocket.getOutputStream());
			InputStreamReader inputStream =new InputStreamReader(clientSocket.getInputStream());
			BufferedReader buff=new BufferedReader(inputStream);
			String message=null;
			message= buff.readLine();
			Thread.sleep(5000);
			//System.out.println("CLIENT: "+message);
			String messagesend="SERVEUR /"+message+"!!\n";
			printStream.println(messagesend);
			printStream.close();
		}catch (IOException e) {
			// TODO: handle
			System.out.println("SERVEUR: probleme d'envoie");
		}
	}*/
}
