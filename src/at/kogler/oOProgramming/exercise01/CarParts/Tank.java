package at.kogler.oOProgramming.exercise01.CarParts;

public class Tank {
    private int fuelRemaining;
    private int maxFuelReserve;
    public Tank(int fuelRemaining, int maxFuelReserve) {
        this.fuelRemaining = fuelRemaining;
        this.maxFuelReserve = maxFuelReserve;
    }






    public int getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public int getMaxFuelReserve() {
        return maxFuelReserve;
    }


}