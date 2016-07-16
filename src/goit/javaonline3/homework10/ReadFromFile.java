package goit.javaonline3.homework10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class ReadFromFile {

    public static String readFromFile(String fileName)  {
        Ceasar ceasar = new Ceasar();
        StringBuilder stringBuilder = new StringBuilder();

        try(FileInputStream fileInputStrim = new FileInputStream(fileName)) {
            int i = -1;

            while((i = fileInputStrim.read()) != -1) {
                stringBuilder.append((char)i);
            }

            return ceasar.decrypt(stringBuilder);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
            return "";
        }
    }
}

//int i = -1
//magic number

//fileInputStrim - grammar mistake