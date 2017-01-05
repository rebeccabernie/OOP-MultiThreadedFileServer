//G00320698 - Rebecca Kane
package ie.gmit.sw.client; // keeping close to project spec...
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;

public class Client {

	private static Socket socket;
	private static String fileName;
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws Throwable{
		socket = new Socket ("localhost", 7777);
		int choice = 0;
		
		System.out.println("1: Connect to Server");
		System.out.println("2: Print File Listing");
		System.out.println("3: Download File");
		System.out.println("4: Quit");
		choice = console.nextInt();
		
		// While loop specified in project spec
		while(choice != 4){
			
			if(choice == 1){
				// Connect to server
				// ...
			}
			else if(choice == 2){
				// From WebClient - Lecture Notes / Practical Resources on moodle, just testing
				// In theory would be text file with list of file names?
				final String request = "GET /files.txt HTTP/1.1\n\n"; //The message to send to the server
			}
			else if(choice == 3){
				//downloadFile(); // run download file method...
			}
			else if(choice == 4){
				// End program
				System.out.println("Program terminated.");
			}
			else{ // just in case user tries an invalid option
				System.out.println("Please enter a valid option...");
				choice = console.nextInt();
			}
		}// end while

	} // end main
	
	
	// Code adapted from -
	// http://codereview.stackexchange.com/questions/20961/java-multi-thread-file-server-and-client	
	public void downloadFile() {
		try {
            int bytesRead;
            InputStream in = socket.getInputStream();

            DataInputStream clientData = new DataInputStream(in);

            fileName = clientData.readUTF();
            OutputStream output = new FileOutputStream(("received_from_server_" + fileName));
            long size = clientData.readLong();
            byte[] buffer = new byte[1024];
            //Reading file as long as amount read != 0?
            while (size > 0 && (bytesRead = clientData.read(buffer, 0, (int) Math.min(buffer.length, size))) != -1) {
                output.write(buffer, 0, bytesRead);
                size -= bytesRead; 
            }

            output.close();
            in.close();

            System.out.println("File "+fileName+" received from Server.");
        } catch (IOException ex) {
            Logger.getLogger(CLIENTConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	
} // end Client
