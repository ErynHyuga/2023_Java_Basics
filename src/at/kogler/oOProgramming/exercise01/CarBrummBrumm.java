package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.CarTank;
import at.kogler.oOProgramming.exercise01.CarParts.CarTyre;
import at.kogler.oOProgramming.exercise01.CarParts.RearMirror;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarBrummBrumm {

    private List<RearMirror> mirrors;
    private List<CarTyre> tyres;
    private int carFuelConsumption;
    private CarTank fuelRemaining;
    private CarEngine engine;
    private CarEngine engineFuelConsumption;
    private CarTank maxFuelReserve;
    private CarTank tank;
    private String carID;
    private String carBrand;
    private String carColour;
    public int carMaxFuelReserve;


    public CarBrummBrumm(RearMirror mirrorR, RearMirror mirrorL, CarTyre frontLeftWheel, CarTyre frontRightWheel, CarTyre backLeftWheel, CarTyre backRightWheel, CarEngine engine, CarTank tank, String carID, String carBrand, String carColour) {
        this.engine = engine;
        this.tank = tank;
        this.carColour = carColour;
        this.carBrand = carBrand;
        this.carID = carID;
        this.mirrors = new ArrayList<>();
        getCarFuelConsumption();
        getCarFuelInStorage();
        getCarMaxFuelReserve();
        System.out.println(String.format("engine %s, tank %s, carColour %s, carBrand %s, carID %s, mirrors %s", engine, tank, carColour, carBrand, carID, mirrors));
        this.mirrors = new ArrayList<>();
        this.tyres = new ArrayList<>();
        this.mirrors.add(mirrorR);
        this.mirrors.add(mirrorL);
        this.tyres.add(frontLeftWheel);
        this.tyres.add(frontRightWheel);
        this.tyres.add(backLeftWheel);
        this.tyres.add(backRightWheel);
    }

    public void drive(int amount) {
        this.engine.drive();
    }

    public void addMirrors(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
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
