package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarParts.CarEngine;
import at.kogler.oOProgramming.exercise01.CarParts.CarTank;

public class MainFirstObject {

    public static void main(String[] args) {
        CarEngine engine1 = new CarEngine(50, CarEngine.fuelType.PETROL, 1);
        CarEngine engine2 = new CarEngine(220, CarEngine.fuelType.DIESEL, 12);
        CarTank tank1 = new CarTank(27,100);
        CarTank tank2 = new CarTank(56,167);
        CarBrummBrumm car1 = new CarBrummBrumm(engine1,tank1,"PE125874", "Peugeot", "Munkili Bru");
        CarBrummBrumm car2 = new CarBrummBrumm(engine2,tank2, "PO12545", "Porsche", "Fiery Rot");


        car1.carGottaGoFastAKADriving();
        car1.carGoHonk();
        car1.carGoSlowAKABreak();
        car1.carGoSuperBoostModeZefix();
        tank1.carMaxFuelChecker();
        car1.carGetRemainingRange();


        car2.carGottaGoFastAKADriving();
        car2.carGoHonk();
        car2.carGoSlowAKABreak();
        car2.carGoSuperBoostModeZefix();
        tank2.carMaxFuelChecker();
        car2.carGetRemainingRange();
    }
}
