package at.kogler.oOProgramming.exercise01.CarParts;

public class CarEngine {
    public CarEngine(int horsepower, fuelType fuelType, int engineFuelConsumption) {

    }

    public enum fuelType {PETROL, DIESEL}
    private int howSpeedy;
    public int engineFuelConsumption;
    private int horsePower;
    private fuelType type;


    public void drive (int amount){
        int speed = 0;
        System.out.println("I am the motor and i am running with" + amount);
        for (int i = 1; i <= 100; i++) {
            if (howSpeedy == i) {
                speed = i;
                break;
            }
        }
        System.out.println("Speedometer: " + speed);
    }

    public int getHorsePower(){
        return horsePower;
    }
    public fuelType getType(){
        return type;
    }

}
