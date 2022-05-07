import java.util.Scanner;

public class CH07_Morse_main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Java Alphabet-to-Morse converter");
        System.out.print("Type a word: ");
        String word = kb.next();
        String morse_code = CH07_Morse.convert(word.toUpperCase());
        System.out.print("Morse Codes: " + morse_code);
        kb.close();
    }
}

