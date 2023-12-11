package at.kogler.oOProgramming.exercise01.CarParts;

public class CarTank {
    public CarTank(int fuelRemaining, int maxFuelReserve) {
        fuelRemaining = this.fuelRemaining;
        maxFuelReserve = this.maxFuelReserve;
    }

    private int fuelRemaining;
    private int maxFuelReserve;

    public void fuelStats(int fuelRemaining, int maxFuelReserve) {
        this.fuelRemaining = fuelRemaining;
        this.maxFuelReserve = maxFuelReserve;
    }

    public void carMaxFuelCheck() {
        if (fuelRemaining > maxFuelReserve) {
            fuelRemaining = maxFuelReserve;
        }
    }
}
/*
Baue einen Motor und einen Tank in Dein Auto ein!
Der Motor kann auf einer Skala von 1 bis 100 betrieben werden -
1 ist langsam, 100 ist Vollgas.
Baue die Methode drive() des Cars um und füge einen Parameter "speed"
mit ein.
*/