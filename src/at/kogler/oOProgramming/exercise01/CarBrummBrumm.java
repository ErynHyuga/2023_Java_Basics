package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.CarTank;

import java.util.Scanner;

public class CarBrummBrumm {

    private int carFuelConsumption;
    private int carFuelInStorage;
    private CarTank fuelRemaining;
    private CarEngine engine;
    private CarEngine engineFuelConsumption;
    private CarTank maxFuelReserve;
    private CarTank tank;
    public String carID;
    public String carBrand;
    public String carColour;
    public int carMaxFuelReserve;

    public int speed;


    public CarBrummBrumm(CarEngine engine, CarTank tank, String carID, String carBrand, String carColour) {
        this.engine = engine;
        this.tank = tank;
        this.carColour = carColour;
        this.carBrand = carBrand;
        this.carID = carID;
        getCarFuelConsumption();
        getCarFuelInStorage();
        getCarMaxFuelReserve();

    }
    public CarEngine getCarFuelConsumption() {
        return engineFuelConsumption;
    }
    public CarTank getCarMaxFuelReserve(){
        return maxFuelReserve;
    }
    public CarTank getCarFuelInStorage(){
        return fuelRemaining;
    }

    public void carGottaGoFastAKADriving() {
        if (carFuelInStorage > 0) {
            System.out.println("I'm gonna step on the gas \n" + "Gas, gas, gas");
            this.carFuelInStorage = this.carFuelInStorage - carFuelConsumption;
        } else {
            System.out.println("Car Cannot Move. Not Enough Fuel");
        }
    }

    public void carGoSlowAKABreak() {
        System.out.println("I Break");
    }

    public void carGoSuperBoostModeZefix() {
        if (carMaxFuelReserve / 10 < carFuelInStorage) {
            System.out.println("very fast");
        } else {
            System.out.println("Not Enough Fuel for this");
        }

    }

    public void carGoHonk() {
        System.out.println("An 'Angerenter Hund' is driving in front of you, and is slow as fuck. How many times do you want to honk at this 'Biara'");
        var scanInput = new Scanner(System.in);
        int inputHonkRepitition = Integer.parseInt(scanInput.next());
        for (int i = 0; inputHonkRepitition >= i; i++) {
            System.out.println("Tu-Tu-Du-Du");
        }

    }

    public void carGetRemainingRange() {
        int remainingRange = carMaxFuelReserve - carFuelConsumption;
        if (remainingRange < 0) {
            carAlarm();
        }
        System.out.println(remainingRange * 100 + " km kann man noch fahren");
    }

    public void carAlarm() {
        System.out.println("ALAAAAAAAAAAAAAAAAAAAAAAAAAAARM");
    }
}
