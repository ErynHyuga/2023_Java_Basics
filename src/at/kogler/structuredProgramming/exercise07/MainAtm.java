package at.kogler.structuredProgramming.exercise07;

import java.util.Scanner;

public class MainAtm {
    public static void main(String[] args) {
        boolean operationGreaterLoop = true;
        int moneySafeFile = 0;
        int moneyBalanceDesignater = 0;
        int moneyMoneyBalance = moneyBalanceDesignater + moneySafeFile;
        while (operationGreaterLoop) {
            boolean operationLoop = true;
            var scanInput = new Scanner(System.in);
            System.out.println("Bitte Passwort eingeben");
            int passCode = scanInput.nextInt();

            if (passCode != 1234) {
                operationLoop = false;
            }
            while (operationLoop) {
                System.out.println("Auswahl eingeben \n" +
                        "1. Einzahlen\n" +
                        "2. Abheben\n" +
                        "3. Konstand\n" +
                        "4. Beenden");
                int inputOptions = scanInput.nextInt();
                if (inputOptions == 1) {
                    System.out.println("Einzahlung");
                    int moneyDeposit = scanInput.nextInt();
                    moneyMoneyBalance += moneyDeposit;
                } else if (inputOptions == 2) {
                    System.out.println("Abheben");
                    int moneyWithdrawel = scanInput.nextInt();
                    moneyMoneyBalance -= moneyWithdrawel;
                } else if (inputOptions == 3) {
                    System.out.println("Kontostand:");
                    System.out.println(moneyMoneyBalance);
                } else if (inputOptions == 4) {
                    operationLoop = false;

                } else {
                    System.out.println("Invalid Input, please retry");
                }
                moneySafeFile = moneyMoneyBalance;
            }

        }
    }
}
