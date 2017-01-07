package ie.gmit.sw.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connector {

	private static final String request = "GET /characters.txt HTTP/1.1\n\n"; 
	
	private static Socket socket;
	private static final int PORT = 7777; // Specified port in spec
	
	// Connect to the server
		public static void connect() { // For in.readObject();
			try { 
				Socket socket = new Socket("localhost", PORT);
				System.out.println("Socket started on " + PORT); // Just confirmation to the user
				
				/*
				//Serialise / marshal a request to the server
				ObjectOutputStream out = new ObjectOutputStream(getSocket().getOutputStream());
				out.writeObject(request); //Serialise
				out.flush(); //Ensure all data sent by flushing buffers
				
				//Deserialise / unmarshal response from server 
				ObjectInputStream in = new ObjectInputStream(getSocket().getInputStream());
				String response = (String) in.readObject(); //Deserialise
				
				UserInterface.setChoice(0);*/
			} catch (Exception e) { // In case something goes wrong 
				System.out.println("Error - " + e.getMessage());
			}
			
		} // end connect()

		public static void closeConnection() throws IOException{
			socket.close();
		}
		
		/*
		public static Socket getSocket() {
			return socket;
		}

		public static void setSocket(Socket socket) {
			Connector.socket = socket;
		}
	*/
}
