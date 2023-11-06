package at.kogler.oOProgramming.exercise01;
import at.kogler.oOProgramming.exercise01.CarBrummBrumm;

public class MainFirstObject {
    public static void main(String[] args) {
        CarBrummBrumm car1 = new CarBrummBrumm();
        CarBrummBrumm car2 = new CarBrummBrumm();


        car1.carID = "PE125874";
        car1.carBrand = "Peugiot";
        car1.carColour = "Munkili Bru";
        car1.carFuelConsumption = 1;
        car1.carFuelInStorage = 27;
        car1.carMaxFuelStorage = 100;

        car2.carID = "PO12545";
        car2.carBrand = "Porsche";
        car2.carColour = "Fiery Red";
        car2.carFuelConsumption = 6;
        car2.carFuelInStorage = 41;
        car2.carMaxFuelStorage = 167;
    }
}
