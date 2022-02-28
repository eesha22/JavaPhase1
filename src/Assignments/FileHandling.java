package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public void fileCreate() {
		try {  
            // Creating an object of a file  
            File f0 = new File("D:fileCreated.txt");   
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");
                       FileWriter fwrite = new FileWriter("D:fileCreated.txt");  
                       fwrite.write("A named location used to store related information is referred to as a File.");   
                       fwrite.close();   
                       System.out.println("Content is successfully wrote to the file.");  
            } else {  
                       System.out.println("File is already exist in the directory.");  
            }
            //reading the file
            Scanner dataReader = new Scanner(f0);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);
            }  
            dataReader.close();
          } catch (FileNotFoundException exception) {  
              System.out.println("Unexcpected error occurred!");  
              exception.printStackTrace();  
          }  catch (IOException exception) {  
                   System.out.println("An unexpected error is occurred.");  
                   exception.printStackTrace();  
          }catch(Exception e) {
              e.printStackTrace();
          } 
	}
	public void fileDelete() {
		
			File f0 = new File("D:fileCreated.txt");
			if (f0.delete()) {   
			      System.out.println(f0.getName()+ " file is deleted successfully.");  
			    } else {  
			      System.out.println("Unexpected error found in deletion of the file.");  
			    }   
	}
	
	public static void main(String[] args) {
		FileHandling fh = new FileHandling();
		fh.fileCreate();
		System.out.println("Now deleting the file\n");
		fh.fileDelete();
	}
}
