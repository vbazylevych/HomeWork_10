package goit.javaonline3.test;

import goit.javaonline3.homework10.ReadFromFile;
import goit.javaonline3.homework10.WriteToFile;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class WriteToFileTest {

    @Test
    public void testWriteToFileEncodedText() throws Exception {
        WriteToFile.writeToFile("def abc #");
        assertEquals("def abc #", ReadFromFile.readFromFile("File.txt"));
    }
}