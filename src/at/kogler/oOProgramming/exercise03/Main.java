package at.kogler.oOProgramming.exercise03;

import at.kogler.oOProgramming.exercise03.Manufacturer;
import at.kogler.oOProgramming.exercise03.Car;
import at.kogler.oOProgramming.exercise03.Engine;

public class Main {

    public static void main(String[] args) {
        Engine DOHC_Straight6_12PS = new Engine(12, Engine.TYPE.DIESEL);
        Manufacturer Toyota_Motor_Corporation = new Manufacturer("Toyota Motor Corporation", "Japan, Toyota", 0.27);
        Car car1 = new Car(120000, "pink", 120, 12500, 7.3, DOHC_Straight6_12PS, Toyota_Motor_Corporation);

        System.out.println(car1.getBaseConsumption());
        car1.discount();
    }


}
