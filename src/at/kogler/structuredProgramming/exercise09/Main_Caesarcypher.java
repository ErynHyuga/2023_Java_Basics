package at.kogler.structuredProgramming.exercise09;
import java.util.Scanner;

public class Main_Caesarcypher {

    public static void main(String[] args) {
        var scanInput = new Scanner(System.in);
        String inputFromConsole = scanInput.nextLine();
        String[] alphabet = {" ", "a", "b", "c", "d", "e", "f", "g","h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s","t", "u", "v", "w", "x", "y", "z"};
        String word = inputFromConsole;
        String encrypted_word = encrypt(word, alphabet, 2);
        System.out.println("Encrypted word: " + encrypted_word);
        String decrypted_word = decrypt(encrypted_word, alphabet, 2);
        System.out.println("Decrypted word: " + decrypted_word);
    }

    public static String encrypt(String string, String[] cipher, int offset){
        String[] string_list = string.split("");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < string_list.length; i++) {
            String character = string_list[i];
            for (int j = 0; j < cipher.length; j++) {
                if (character.equals(cipher[j])) {
                    output.append(cipher[(j+offset)%cipher.length]);
                }
            }
        }
        return output.toString();
    }

    public static String decrypt(String string, String[] cipher, int offset){
        String[] string_list = string.split("");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < string_list.length; i++) {
            String character = string_list[i];
            for (int j = 0; j < cipher.length; j++) {
                if (character.equals(cipher[j])) {
                    int new_index = j - offset;
                    while (new_index < 0){
                        new_index += cipher.length;
                    }
                    output.append(cipher[new_index]);
                }
            }
        }
        return output.toString();
    }
}
