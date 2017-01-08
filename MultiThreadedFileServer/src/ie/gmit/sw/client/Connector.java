// G00320698 - Rebecca Kane
// Connector class - handles all functionality to do with connection

package ie.gmit.sw.client;

import java.net.Socket;

public class Connector {
	
	private static Socket s;
	
	/*
	// public Connector() segment adapted from "WebClient Source Code" (Lecturer John Healy) on moodle
	public Connector(){
		new Thread(new Runnable(){
			public void run() { 
				try {
					s = new Socket("localhost", 7777);
					
					System.out.println("Client connected to server...");
					
					//s.close();
					
				} catch (Exception e) { 
					System.out.println("Error - " + e.getMessage());
				}
			} // End run()
			
		}, "Connector - ").start();
		
	} // Close Connector*/
	
	public void openConnection() {
		try {
			s = new Socket("localhost", 7777);
			
			System.out.println("Client connected to server...");
			
			//s.close();
			
		} catch (Exception e) { 
			System.out.println("Error - " + e.getMessage());
		}
	}
	
	public static void closeConnection() throws Exception{
		s.close();
		System.out.println("Server connection closed.");
	}

} // End class

