package at.kogler.structuredProgramming.exercise10;
import java.util.Scanner;
public class MainStringHelper {
    public static void main(String[] args) {
        var scanInput = new Scanner(System.in);
        System.out.println(StringHelperChecker.countLetters("Hello World!", 'l'));
        String input = scanInput.nextLine();
        System.out.println(StringHelperChecker.isPalindrome(input));
        System.out.println(StringHelperChecker.countLetters(input, 'l'));
        System.out.println(StringHelperChecker.reverseString(input));
        StringHelperChecker.printAmountOfLetters(input);
    }
}
