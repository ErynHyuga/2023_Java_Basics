package at.kogler.structuredProgramming.exercise11;
import java.util.Scanner;
import java.util.Random;

public class MainWordGuesser {
    public static void main(String[] args) {
        String[] words = {"Agrennt", "Grindig", "Hobler", "Irrer", "Fonsi", "reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "Khal", "Maekar the Anvil", "Grindiger Fonsi", "WE ARE THE HAMMER", "Primaerschluessel"};
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedWordArray = new char[wordToGuess.length()];
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the word: " + getMaskedWord(guessedWordArray));
            System.out.println("Attempts: " + attempts);
            System.out.print("Enter a letter: ");
            char letter = scanner.nextLine().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedWordArray[i] = letter;
                    found = true;
                }
            }

            if (!found) {
                attempts++;
            }

            if (String.valueOf(guessedWordArray).equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }
    }

    private static String getMaskedWord(char[] guessedWordArray) {
        StringBuilder maskedWord = new StringBuilder();
        for (char counter : guessedWordArray) {
            if (counter == '\u0000') {
                maskedWord.append("*");
            } else {
                maskedWord.append(counter);
            }
            maskedWord.append(" ");
        }
        return maskedWord.toString();
    }
}
