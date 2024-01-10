package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.Tank;
import at.kogler.oOProgramming.exercise01.CarParts.Tyre;
import at.kogler.oOProgramming.exercise01.CarParts.Mirror;

public class MainFirstObject {

    public static void main(String[] args) {

        CarEngine engine1 = new CarEngine(50, CarEngine.fuelType.PETROL, 1);
        CarEngine engine2 = new CarEngine(220, CarEngine.fuelType.DIESEL, 12);
        Mirror mirL1 = new Mirror(10 * 10, "left", +10);
        Mirror mirR1 = new Mirror(10 * 10, "right", +10);
        Mirror mirL2 = new Mirror(10 * 15, "left", -5);
        Mirror mirR2 = new Mirror(10 * 15, "left", -5);
        Tank tank1 = new Tank(27, 100);
        Tank tank2 = new Tank(56, 167);
        Tyre fLW1 = new Tyre(4, 30, 3.4);
        Tyre fRW1 = new Tyre(4, 30, 3.4);
        Tyre bLW1 = new Tyre(4, 30, 3.4);
        Tyre bRW1 = new Tyre(4, 30, 3.4);
        Tyre fLW2 = new Tyre(8, 16, 5);
        Tyre fRW2 = new Tyre(8, 16, 5);
        Tyre bLW2 = new Tyre(8, 16, 5);
        Tyre bRW2 = new Tyre(8, 16, 5);

        CarBrummBrumm car1 = new CarBrummBrumm(mirR1, mirL1, fLW1, fRW1, bLW1, bRW1, engine1, tank1, "PE125874", "Peugeot", "Munkili Bru");
        CarBrummBrumm car2 = new CarBrummBrumm(mirR2, mirL2, fLW2, fRW2, bLW2, bRW2, engine2, tank2, "PO12545", "Porsche", "Fiery Rot");

        System.out.println("Tank" + car1.getTank().getFuelRemaining());
        System.out.println(car1.getCarColour());

        car1.carGottaGoFastAKADriving();
        car1.carGoHonk();
        car1.carGoSlowAKABreak();
        car1.carGetRemainingRange();
        engine1.carGoSuperBoostModeZefix();



        car2.carGottaGoFastAKADriving();
        car2.carGoHonk();
        car2.carGoSlowAKABreak();
        car2.carGetRemainingRange();
        engine2.carGoSuperBoostModeZefix();
        engine2.drive();

    }
}