package at.kogler.oOProgramming.exercise01.CarParts;

public class CarEngine {
    public CarEngine(int horsepower, fuelType fuelType, int engineFuelConsumption) {
    }

    public enum fuelType {PETROL, DIESEL}

    public int engineFuelConsumption;
    private int horsePower;
    private fuelType type;

    public void drive (int amount){
        System.out.println("I am the motor and i am running with" + amount);

        }
    public int getHorsePower(){
        return horsePower;
    }
    public fuelType getType(){
        return type;
    }

}
