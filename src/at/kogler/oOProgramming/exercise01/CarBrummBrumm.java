package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.CarTank;

import java.util.List;
import java.util.Scanner;

public class CarBrummBrumm {

    private List<RearMirror> mirrors;
    private int carFuelConsumption;
    private int carFuelInStorage;
    private CarTank fuelRemaining;
    private CarEngine engine;
    private CarEngine engineFuelConsumption;
    private CarTank maxFuelReserve;
    private CarTank tank;

    private String carID;
    private String carBrand;
    private String carColour;
    public int carMaxFuelReserve;
    private int speed;


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

    public CarTank getCarMaxFuelReserve() {
        return maxFuelReserve;
    }

    public CarTank getCarFuelInStorage() {
        return fuelRemaining;
    }

    public void carGottaGoFastAKADriving() {

    }

    public void carGoSlowAKABreak() {
        System.out.println("I Break");
    }


    public void carGoHonk() {
        System.out.println("An 'Angerenter Hund' is driving in front of you, and is slow as fuck. How many times do you want to honk at this 'Biara'");
        var scanInput = new Scanner(System.in);
        int inputHonkRepitition = Integer.parseInt(scanInput.next());
        for (int i = 1; inputHonkRepitition >= i; i++) {
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
