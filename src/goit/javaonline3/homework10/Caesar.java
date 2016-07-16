package goit.javaonline3.homework10;

import java.util.ArrayList;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class Caesar {
    private static final ArrayList<Character> artificialAlphabet = new ArrayList<>();
    private static final int shift = 3;

    static {

        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            artificialAlphabet.add(symbol);
        }
    }

    public static String encrypt(String text){
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if (currentSymbolPosition >= 0) {
                encryptedText.append(artificialAlphabet.get(findNewSymbolPositionForEncriptyng(currentSymbolPosition)));
            } else {
                encryptedText.append(text.charAt(i));
            }
        }
        return encryptedText.toString();
    }

    private static int findNewSymbolPositionForEncriptyng(int currentSymbolPosition){

        if (currentSymbolPosition <= artificialAlphabet.size() - shift - 1) {
            return currentSymbolPosition + 3;
        } else {
            return shift - (artificialAlphabet.size() % currentSymbolPosition);
        }
    }

    public static String decrypt(String text){
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if (currentSymbolPosition >= 0) {
                decryptedText.append(artificialAlphabet.get(findOldSymbolPositionForEncriptyng(currentSymbolPosition)));
            } else {
                decryptedText.append( text.charAt(i));
            }
        }
        return decryptedText.toString();
    }

    private static int findOldSymbolPositionForEncriptyng(int currentSymbolPosition){

        if (currentSymbolPosition <= shift - 1) {
            return artificialAlphabet.size() - shift + currentSymbolPosition;
        } else {
            return currentSymbolPosition - shift;
        }
    }

    public static ArrayList<Character> getArtificialAlphabet() {
        return artificialAlphabet;
    }

    public static int getShift() {
        return shift;
    }
}

//why fields are not private

//public static final ArrayList<Character> artificialAlphabet = new ArrayList<Character>();
//you should not write <Character> twice

//Caesar, encript, encriptedText, findNewSymbolPositionForEncripting - grammar mistakes

//why do you initialize the static field by constructor?