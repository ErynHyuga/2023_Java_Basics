package at.kogler.oOProgramming.exercise01;

public class CarBrummBrumm {
    public String carID;
    public String carBrand;
    public String carColour;
    public int carFuelConsumption;
    public int carFuelInStorage;
    public int carMaxFuelStorage;
    int speed;
    public void carBeFastAsFuckBoyyyyAKADriving() {
        if(carFuelInStorage > 0){
            System.out.println("'Cause I'm crazy, hot and ready, but you like it\n" +
                    "I wanna race for you (Shall I go now?)\n" +
                    "Gas, gas, gas\n" +
                    "I'm gonna step on the gas");
            this.carFuelInStorage = this.carFuelInStorage - carFuelConsumption;

        }
    }

    public void carGoSlowAKABreak() {
        System.out.println("I Break");
    }
    public void carGoSuperBoostModeZefix(){
        System.out.println("very fast");
    }
    public void carGoHonk(){
        System.out.println("Tu-Tu-Du-Du");
    }
}
