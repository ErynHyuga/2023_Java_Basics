package at.kogler.oOProgramming.Exercise05;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        SciencCalc sciencCalc = new SciencCalc();
        RootCalculator rootCalculator = new RootCalculator();

        System.out.println(calculator.div(16,4));
        System.out.println(sciencCalc.cosinus(1));
        System.out.println(rootCalculator.root(16));
        System.out.println(sciencCalc.sinus(    4));















    }
}
/*    Gegeben ist ein Rechner, der die Grundrechnungsarten beherrscht.

        Zusätzlich gibt es

        - einen Wissenschaftlichen Rechner, der auch Sinus und Cosinus kann
        - Einen Wurzelrechner, der auch die Wurzel ziehen kann

*/