package at.kogler.oOProgramming.Exercise05;
import java.util.Scanner;
public class Calculator {
    Scanner fIntake = new Scanner(System.in);
    Scanner secondIntake = new Scanner(System.in);

    int a = fIntake.nextInt();
    int b = secondIntake.nextInt();
    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double div(double a, double b){
        return a / b;
    }
    public double mult(double a, double b){
        return a * b;
    }
}
/*
Gegeben ist ein Rechner, der die Grundrechnungsarten beherrscht.

Zusätzlich gibt es

	- einen Wissenschaftlichen Rechner, der auch Sinus und Cosinus kann
	- Einen Wurzelrechner, der auch die Wurzel ziehen kann
*/

