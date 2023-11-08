package at.kogler.oOProgramming.exercise01;
import java.util.Scanner;

public class CarBrummBrumm {
    public String carID;
    public String carBrand;
    public String carColour;
    public int carFuelConsumption;
    public int carFuelInStorage;
    public int carMaxFuelStorage;
    int speed;

    public void carMaxFuelChecker(){
        if (carFuelInStorage > carMaxFuelStorage){
            carFuelInStorage = carMaxFuelStorage;
        }
    }

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
        if (carMaxFuelStorage / 10 < carFuelInStorage ) {
            System.out.println("very fast");

        }

    }
    public void carGoHonk(){
        var scanInput = new Scanner(System.in);
        int inputHonkRepitition = Integer.parseInt(scanInput.next());
        for (){
            System.out.println("Tu-Tu-Du-Du");
        }

    }
}
