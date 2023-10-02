package at.kogler.exercise08;

import java.util.Random;

public class Main_SlicerDicer {
    public static void main(String[] args) {
        var randomNumberGenerator = new Random();
        boolean drawerCog = true;
        int eyeCountPlayer = 0;
        int eyeCountComputer = 0;

        while(drawerCog) {
            for (int i = 0; i <= 6; i++) {
                int randomNumberPlayer = randomNumberGenerator.nextInt(7);
                eyeCountPlayer += randomNumberPlayer;
            }
            for (int i1 = 0; i1 <= 6; i1++) {
                int randomNumberComputer = randomNumberGenerator.nextInt(7);
                eyeCountComputer += randomNumberComputer;
            }
            if (eyeCountPlayer > eyeCountComputer) {
                System.out.println("Player won");
            } else if (eyeCountComputer > eyeCountPlayer) {
                System.out.println("Computer won");
            } else {
                drawerCog = false;
                System.out.println("Draw or what not");
            }
        }
    }
}