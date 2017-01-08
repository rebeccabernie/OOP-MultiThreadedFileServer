// G00320698 - Rebecca Kane
// Filetor class - handles all functionality to do with files - displaying, downloading etc

package ie.gmit.sw.client;

import java.io.*;

public class Fileator {
	
	public Fileator(){
		new Thread(new Runnable(){
			public void run() { 
				try {
					
				} catch (Exception e) { 
					System.out.println("Error - " + e.getMessage());
				}
			} // End run()
			
		}, "Fileator - ").start();
		
		} // Close Connector
	
	public static void listDownloadableFiles(){
		
		// http://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
		File folder = new File("MultiThreadedFileServer/src/ie/gmit/sw/server/files");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      
		    	if (listOfFiles[i].isFile()) { // if item is a file, do this
		        System.out.println("File - " + listOfFiles[i].getName());
		      } 
		      
		      else if (listOfFiles[i].isDirectory()) { // if item is a directory - just in case folder with files contains a sub-directory
		        System.out.println("Directory - " + listOfFiles[i].getName());
		      }
		    }

	} // End listDownloadableFiles()
	
} // End class