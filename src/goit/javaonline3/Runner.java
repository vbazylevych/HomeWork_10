package goit.javaonline3;

import goit.javaonline3.homework10.MyScanner;
import goit.javaonline3.homework10.ReadFromFile;
import goit.javaonline3.homework10.WriteToFile;


/**
 * Created by Ler4enko on 16.07.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        System.out.println("Enter your text:");
        WriteToFile.writeToFileEncodedText(MyScanner.getString());

        System.out.println("Was read from file:");
        System.out.println(ReadFromFile.readFromFile("File.txt"));

        MyScanner.close();
    }
}
