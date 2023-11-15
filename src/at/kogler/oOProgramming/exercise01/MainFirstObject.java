package at.kogler.oOProgramming.exercise01;

import at.kogler.oOProgramming.exercise01.CarBrummBrumm;

public class MainFirstObject {

    public static void main(String[] args) {
        CarBrummBrumm car1 = new CarBrummBrumm(1, 27, 100, "PE125874", "Peugeot", "Munkili Bru");
        CarBrummBrumm car2 = new CarBrummBrumm(12, 41, 167, "PO12545", "Porsche", "Fiery Rot");


        car1.carBeFastAsFuckBoyyyyAKADriving();
        car1.carGoHonk();
        car1.carGoSlowAKABreak();
        car1.carGoSuperBoostModeZefix();
        car1.carMaxFuelChecker();
        car1.carGetRemainingRange();


        car2.carBeFastAsFuckBoyyyyAKADriving();
        car2.carGoHonk();
        car2.carGoSlowAKABreak();
        car2.carGoSuperBoostModeZefix();
        car2.carMaxFuelChecker();
        car2.carGetRemainingRange();
    }
}
