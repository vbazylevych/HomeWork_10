package goit.javaonline3.homework10;

import java.util.ArrayList;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class Ceasar {
    public static final ArrayList<Character> artificialAlphabet = new ArrayList<Character>();
    public static final int shift = 3;

    public Ceasar() {

        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'а'; symbol <= 'я'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'А'; symbol <= 'Я'; symbol++) {
            artificialAlphabet.add(symbol);
        }
    }

    public String encript(String text){
        StringBuilder encriptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if (currentSymbolPosition >= 0) {
                encriptedText.append(artificialAlphabet.get(findNewSymbolPositionForEncripting(currentSymbolPosition)));
            } else {
                encriptedText.append(text.charAt(i));
            }
        }
        return encriptedText.toString();
    }

    private int findNewSymbolPositionForEncripting(int currentSymbolPosition){

        if (currentSymbolPosition <= artificialAlphabet.size() - shift - 1) {
            return currentSymbolPosition + 3;
        } else {
            return shift - (artificialAlphabet.size() % currentSymbolPosition);
        }
    }

    public String decrypt(StringBuilder text){
        StringBuilder encriptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if (currentSymbolPosition >= 0) {
                encriptedText.append(artificialAlphabet.get(findOldSymbolPositionForEncripting(currentSymbolPosition)));
            } else {
                encriptedText.append( text.charAt(i));
            }
        }
        return encriptedText.toString();
    }

    private int findOldSymbolPositionForEncripting(int currentSymbolPosition){

        if (currentSymbolPosition <= shift - 1) {
            return artificialAlphabet.size() - shift + currentSymbolPosition;
        } else {
            return currentSymbolPosition - shift;
        }
    }

    public ArrayList<Character> getArtificialAlphabet() {
        return artificialAlphabet;
    }

    public int getShift() {
        return shift;
    }
}

//why fields are not private

//public static final ArrayList<Character> artificialAlphabet = new ArrayList<Character>();
//you should not write <Character> twice

//Ceasar, encript, encriptedText, findNewSymbolPositionForEncripting - grammar mistakes

//why do you initialize the static field by constructor?