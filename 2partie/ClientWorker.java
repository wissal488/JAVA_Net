package inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientWorker implements Runnable {

	Socket clientSocket;
	 public ClientWorker(Socket s) {
		// TOD
		this.clientSocket=s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
		}catch (IOException | InterruptedException e) {
			// TODO: handle
			System.out.println("SERVEUR: probleme d'envoie");
		}
	}
	

}
