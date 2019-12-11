package inet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static void main(String[] args) {
		System.out.println("=====SERVEUR=========");
		ServerSocket sersocket=null;
		int port=1234;
		try {
			sersocket=new ServerSocket(port);
			System.out.println();
		}
		
		/*ServerSocket sSoc=null;
		Socket soc=null;
		int port=4045;
		try {
			sSoc=new ServerSocket(port);
			System.out.println("SERVEUR: OK sur le port:"+port);
			soc=sSoc.accept();
			BufferedReader br= new BufferedReader(new InputStreamReader(soc.getInputStream()));
			PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())),true);
			while(true) {
				String str=br.readLine();
				if(str.equals("END")) break;
				System.out.println(str);
				pw.println(str);
			}
			sSoc.close();
			soc.close();
		}catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
}
