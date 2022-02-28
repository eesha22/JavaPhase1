package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class ReadWriteFile
{
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("D:fileCreated1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data1");
          writer.close();
          System.out.println("File 1 Data : ");
          try {  
              // Create f1 object of the file to read data  
              File f1 = new File("D:fileCreated1.txt");    
              Scanner dataReader = new Scanner(f1);  
              while (dataReader.hasNextLine()) {  
                  String fileData = dataReader.nextLine();  
                  System.out.println(fileData);  
              }  
              dataReader.close();  
          } catch (FileNotFoundException exception) {  
              System.out.println("Unexcpected error occurred!");  
              exception.printStackTrace();  
          }  
    }
 
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data2";
        FileOutputStream out = new FileOutputStream("D:fileCreated2.txt");
        out.write(data.getBytes());
        out.close();
        System.out.println("File 2 Data : ");
        try {  
            // Create f1 object of the file to read data  
            File f2 = new File("D:fileCreated2.txt");    
            Scanner dataReader = new Scanner(f2);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data3";
        Files.write(Paths.get("D:fileCreated3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
        System.out.println("Write and append operation on file.");
       Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
       System.out.println("File 3 Data : ");
       try {  
           // Create f1 object of the file to read data  
           File f3 = new File("D:fileCreated3.txt");    
           Scanner dataReader = new Scanner(f3);  
           while (dataReader.hasNextLine()) {  
               String fileData = dataReader.nextLine();  
               System.out.println(fileData);  
           }  
           dataReader.close();  
       } catch (FileNotFoundException exception) {  
           System.out.println("Unexcpected error occurred!");  
           exception.printStackTrace();  
       }  
    }
}