package at.kogler.exercise01;

import java.sql.SQLOutput;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random RNG = new Random();
        int RN = RNG.nextInt(100);
        System.out.println(RN);

        if (RN < 20){
            System.out.println("Mini");
        }else if( 20 <= RN && RN < 50){
            System.out.println("medium");
        } else if (50 < RN) {
            System.out.println("Large");
        }
    }
}