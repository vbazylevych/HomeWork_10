package goit.javaonline3.homework10;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class WriteToFile {

   public static void writeToFile(String text)  {

       try(FileOutputStream fileOutputStream = new FileOutputStream("File.txt")) {
           byte[] buffer = text.getBytes();

           fileOutputStream.write(buffer, 0, buffer.length);
       } catch(IOException ex) {
           System.out.println(ex.getMessage());
       }
   }
}

//writeToFileEncodedText() it will be good to decompose this method