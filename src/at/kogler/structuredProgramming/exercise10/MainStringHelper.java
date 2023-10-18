package at.kogler.structuredProgramming.exercise10;
import java.util.Scanner;


public class MainStringHelper {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Input Word: ");

        String inFromConsole = scanInput.next();

        if(inFromConsole.charAt(0)==inFromConsole.charAt(inFromConsole.length()-1)) {
            System.out.println("test");
        }

    }

}
