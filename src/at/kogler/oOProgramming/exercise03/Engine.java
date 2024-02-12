package at.kogler.oOProgramming.exercise03;

public class Engine{

    private enum fuelType {PETROL, DIESEL};
    private int pOWER;

    public Engine(int pOWER, fuelType fuelType, int engineFuelConsumption) {
        this.pOWER = pOWER;
        this.fuelType = fuelType;
        this.engineFuelConsumption = engineFuelConsumption;
    }

}