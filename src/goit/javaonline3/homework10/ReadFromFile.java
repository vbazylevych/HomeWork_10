package goit.javaonline3.homework10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class ReadFromFile {

    public static String readFromFile(String fileName)  {

        StringBuilder stringBuilder = new StringBuilder();

        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int symbolNumber = -1;

            while((symbolNumber = fileInputStream.read()) != -1) {
                stringBuilder.append((char)symbolNumber);
            }
            return stringBuilder.toString();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
            return "";
        }
    }
}

//int i = -1
//magic number