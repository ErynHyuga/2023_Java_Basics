package at.kogler.structuredProgramming.exercise06;
import java.util.Random;
public class MainWhile {
    public static void main(String[] args) {
        boolean checkerTrue = true;

        int k = 0;
        while (checkerTrue){

            Random RNG = new Random();
            int RN = RNG.nextInt(10, 30 );

            k = RN + k;
            System.out.println(k);

            if (RN == 15 || RN == 25){
            checkerTrue = false;
            }
        }
    }
}
