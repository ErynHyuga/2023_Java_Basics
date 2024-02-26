package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.Tank;
import at.kogler.oOProgramming.exercise01.CarParts.Tyre;
import at.kogler.oOProgramming.exercise01.CarParts.Mirror;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarBrummBrumm {

    private List<Mirror> mirrors;
    private List<Tyre> tyres;
    private int carFuelConsumption;
    private Tank fuelRemaining;
    private CarEngine engine;
    private CarEngine engineFuelConsumption;
    private Tank maxFuelReserve;
    private Tank tank;
    private String carID;
    private String carBrand;
    private String carColour;
    public int carMaxFuelReserve;


    public CarBrummBrumm(Mirror mirrorR, Mirror mirrorL, Tyre frontLeftWheel, Tyre frontRightWheel, Tyre backLeftWheel, Tyre backRightWheel, CarEngine engine, Tank tank, String carID, String carBrand, String carColour) {
        this.engine = engine;
        this.tank = tank;
        this.carColour = carColour;
        this.carBrand = carBrand;
        this.carID = carID;
        this.mirrors = new ArrayList<>();

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

    public void addTyre(Tyre tyre){
        this.tyres.add(tyre);
    }

    public void drive(int amount) {
        this.engine.drive();
    }

    public void addMirrors(Mirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

      public List<Mirror> getMirrors() {
        return mirrors;
    }

    public CarEngine getCarFuelConsumption() {
        return engineFuelConsumption;
    }

    public Tank getCarMaxFuelReserve() {
        return maxFuelReserve;
    }

    public Tank getCarFuelInStorage() {
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

    public void setMirrors(List<Mirror> mirrors) {
        this.mirrors = mirrors;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void setTyres(List<Tyre> tyres) {
        this.tyres = tyres;
    }

    public void setCarFuelConsumption(int carFuelConsumption) {
        this.carFuelConsumption = carFuelConsumption;
    }

    public Tank getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(Tank fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public CarEngine getEngineFuelConsumption() {
        return engineFuelConsumption;
    }

    public void setEngineFuelConsumption(CarEngine engineFuelConsumption) {
        this.engineFuelConsumption = engineFuelConsumption;
    }

    public Tank getMaxFuelReserve() {
        return maxFuelReserve;
    }

    public void setMaxFuelReserve(Tank maxFuelReserve) {
        this.maxFuelReserve = maxFuelReserve;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void setCarMaxFuelReserve(int carMaxFuelReserve) {
        this.carMaxFuelReserve = carMaxFuelReserve;
    }
}
