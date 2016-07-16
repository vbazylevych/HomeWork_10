package goit.javaonline3.test;

import goit.javaonline3.homework10.ReadFromFile;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Ler4enko on 16.07.2016.
 */
public class ReadFromFileTest {

    @Test
    public void testReadFromFile() throws Exception {
        assertEquals("abc ЭЮЯ #", ReadFromFile.readFromFile("TestData.txt"));
    }
}