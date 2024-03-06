package at.kogler.oOProgramming.Exercise05;

import java.util.Scanner;

public class SciencCacl extends Calculator{
    public double sinus(double a){
        Math.sin(a);
        return a;
    }
    public double cosinus(double b){
        Math.cos(b);
        return b;
    }
    Scanner fIntake = new Scanner(System.in);
    Scanner secondIntake = new Scanner(System.in);

    int a = fIntake.nextInt();
    int b = secondIntake.nextInt();

}
