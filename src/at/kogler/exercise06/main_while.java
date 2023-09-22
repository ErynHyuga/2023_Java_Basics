package at.kogler.exercise06;
import java.util.Random;
public class main_while {
    public static void main(String[] args) {
        boolean checker = true;

        int k = 0;
        while (checker){

            Random RNG = new Random();
            int RN = RNG.nextInt(10, 30 );

            k = RN + k;
            System.out.println(k);

            if (RN == 15 || RN == 25){
            checker = false;
            }
        }
    }
}
