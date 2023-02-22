package day33;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket Server;
		try {
			Server = new ServerSocket(port);
			while(true) {
				Socket client = Server.accept();
			}
		}catch(Exception e){
			
		}
	}

}
