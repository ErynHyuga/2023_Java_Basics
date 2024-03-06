package at.kogler.oOProgramming.Exercise05;

import java.lang.Math;
import java.util.Scanner;

public class RootCalculator extends Calculator{

    public double exp(double a){
        Math.exp(a);
        return a;
    }
    public double root(double b){
        Math.sqrt(b);
        return b;
    }

    Scanner fIntake = new Scanner(System.in);
    Scanner secondIntake = new Scanner(System.in);

    int a = fIntake.nextInt();
    int b = secondIntake.nextInt();
}
