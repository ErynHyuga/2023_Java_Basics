package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.CarTank;
import at.kogler.oOProgramming.exercise01.CarParts.CarTyre;
import at.kogler.oOProgramming.exercise01.CarParts.RearMirror;

import java.util.Scanner;

public class MainFirstObject {

    public static void main(String[] args) {

        CarEngine engine1 = new CarEngine(50, CarEngine.fuelType.PETROL, 1);
        CarEngine engine2 = new CarEngine(220, CarEngine.fuelType.DIESEL, 12);
        RearMirror mirl1 = new RearMirror(10 * 10, "left", +10);
        RearMirror mirr1 = new RearMirror(10 * 10, "right", +10);
        RearMirror mirl2 = new RearMirror(10 * 15, "left", -5);
        RearMirror mirr2 = new RearMirror(10 * 15, "left", -5);
        CarTank tank1 = new CarTank(27, 100);
        CarTank tank2 = new CarTank(56, 167);
        CarTyre fLW1 = new CarTyre(4, 30, 3.4);
        CarTyre fRW1 = new CarTyre(4, 30, 3.4);
        CarTyre blW1 = new CarTyre(4, 30, 3.4);
        CarTyre brW1 = new CarTyre(4, 30, 3.4);
        CarBrummBrumm car1 = new CarBrummBrumm(mirr1, mirl1, fLW1,fRW1, bLW1, engine1, tank1, "PE125874", "Peugeot", "Munkili Bru");
        CarBrummBrumm car2 = new CarBrummBrumm("mirr2", "mirl2", engine2, tank2, "PO12545", "Porsche", "Fiery Rot");


        car1.carGottaGoFastAKADriving();
        car1.carGoHonk();
        car1.carGoSlowAKABreak();
        car1.carGetRemainingRange();
        engine1.carGoSuperBoostModeZefix();
        tank1.carMaxFuelCheck();


        car2.carGottaGoFastAKADriving();
        car2.carGoHonk();
        car2.carGoSlowAKABreak();
        car2.carGetRemainingRange();
        engine2.carGoSuperBoostModeZefix();
        engine2.drive();
        tank2.carMaxFuelCheck();
    }
}