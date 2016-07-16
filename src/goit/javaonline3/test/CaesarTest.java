package goit.javaonline3.test;

import goit.javaonline3.homework10.Caesar;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 17.07.2016.
 */
public class CaesarTest {

    @Test
    public void testEncrypt() throws Exception {
        assertEquals("def # Zabc", Caesar.encrypt("abc # WXYZ").toString());
    }

    @Test
    public void testDecrypt() throws Exception {
        assertEquals("abc # WXYZ", Caesar.decrypt("def # Zabc").toString());
    }
}