package at.kogler.oOProgramming.exercise01.CarParts;
import java.util.Scanner;

public class CarTank {
    public CarTank(int fuelRemaining, int maxFuelReserve) {
        fuelRemaining = this.fuelRemaining;
        maxFuelReserve = this.maxFuelReserve;
    }

    private int fuelRemaining;
    private int maxFuelReserve;



    public void fuelStats(int fuelRemaining, int maxFuelReserve) {
        this.fuelRemaining = fuelRemaining;
        this.maxFuelReserve = maxFuelReserve;
    }

    public void carMaxFuelCheck() {
        if (fuelRemaining > maxFuelReserve) {
            fuelRemaining = maxFuelReserve;
        }
    }
}
