package at.kogler.exercise03;
import java.util.Random;
public class main_switch {
    public static void main(String[] args) {

        Random RNG = new Random();
        int RN = RNG.nextInt(5, 10);
        System.out.println(RN);

        switch (RN) {
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case  10:
                System.out.println("ten");

        }
    }
}
