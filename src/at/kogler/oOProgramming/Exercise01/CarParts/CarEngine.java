package at.kogler.oOProgramming.Exercise01.CarParts;

import java.util.Scanner;

public class CarEngine {
    public CarEngine(int horsepower, fuelType fuelType, int engineFuelConsumption) {

    }

    public enum fuelType {PETROL, DIESEL}

    private Tank fuelRemaining;
    public int tankMaxFuelReserve;
    public int tankFuelInStorage;
    private int howSpeedy;
    public int engineFuelConsumption;
    private int horsePower;
    private fuelType type;

    Scanner scanSpeeder = new Scanner(System.in);
    public int gear;

    public void drive() {
        System.out.println("Speedy");
        gear = scanSpeeder.nextInt();

        int speed = 0;
        if (tankFuelInStorage > 0) {
            System.out.println("I'm gonna step on the gas \n" + "Gas, gas, gas");
            this.tankFuelInStorage = this.tankFuelInStorage - engineFuelConsumption;
            System.out.println("I am the motor and i am running in gear " + gear);
            for (int i = 1; i <= 100; i++) {
                if (howSpeedy == i) {
                    speed = i;
                    break;
                }
            }
            System.out.println("Speedometer: " + speed);

        } else {
            System.out.println("Car Cannot Move. Not Enough Fuel");
        }
    }

    public void carGoSuperBoostModeZefix() {
        if (tankMaxFuelReserve / 10 < tankFuelInStorage) {
            System.out.println("very fast");
        } else {
            System.out.println("Not Enough Fuel for this");
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public fuelType getType() {
        return type;
    }
}
