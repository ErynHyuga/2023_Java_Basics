package at.kogler.structuredProgramming.exercise02;

import java.util.Random;

//import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class MainIf02 {
    public static void main(String[] args) {
        Random RNG = new Random();
        int RN_01 = RNG.nextInt(100);
        int RN_02 = RNG.nextInt(100);
        System.out.println("Nummer 1: " + RN_01);
        System.out.println("Nummer 2: " + RN_02);

        if (RN_01 < RN_02 && RN_01 < 50) {
            System.out.println("Nummer 1 ist kleiner als Nummer 2 und Mini");
        } else if (RN_01 < 30 || RN_02 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }
        else if (RN_01 < 50 && RN_02 != 50){
            System.out.println("Erste Zahl ist klein, zweite kein 50igera");
        }
    }
}
