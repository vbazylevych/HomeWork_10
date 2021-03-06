package goit.javaonline3;

import goit.javaonline3.homework10.Caesar;
import goit.javaonline3.homework10.MyScanner;
import goit.javaonline3.homework10.ReadFromFile;
import goit.javaonline3.homework10.WriteToFile;


/**
 * Created by Ler4enko on 16.07.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        System.out.println("Enter text which you want decrypt and save to file File.txt:");

        String encryptedText = Caesar.encrypt(MyScanner.getString());
        WriteToFile.writeToFile(encryptedText);

        String textFromFile = ReadFromFile.readFromFile("File.txt");

        System.out.println("Text which was read from File.txt:" + "\n" + textFromFile + "\n");

        System.out.println("Decrypted text from File.txt");

        System.out.println(Caesar.decrypt(textFromFile));

        MyScanner.close();
    }
}