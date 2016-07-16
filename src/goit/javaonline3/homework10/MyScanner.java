package goit.javaonline3.homework10;

import java.util.Scanner;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class MyScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        while(true) {

            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.nextLine();
            }
        }
    }

    public static void close() {
        scanner.close();
    }
}
