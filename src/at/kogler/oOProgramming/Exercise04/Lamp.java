package at.kogler.oOProgramming.Exercise04;

import java.util.ArrayList;
import java.util.List;

public class Lamp {


    private List<GlowElement> glowElementsList;

    public Lamp() {
        this.glowElementsList = new ArrayList<>();
        getTotalEnergyConsumption();

    }

    public void getTotalEnergyConsumption() {
        int totalEnergyConsumption = 0;
        for (GlowElement glowElement : glowElementsList) {
            totalEnergyConsumption += glowElement.getEnergieConsumption();
        }
    }

    public void addGlowElement(GlowElement glowElement){
        this.glowElementsList.add(glowElement);
    }
    public String printNamesOfLightElement(GlowElement glowElement){

        return glowElement.getName();
    }
    public void turnAllOn() {
        for (GlowElement glowElement : glowElementsList) {
            glowElement.turnOn();
            if (!GlowElement.getStatus) {
                GlowElement.getStatus = true;
                System.out.println(GlowElement.name + " is setting light on fire");
                GlowElement.getEnergieConsumption += 5;
            } else {
                System.out.println("I'm " + GlowElement.name + ", Shining Bright as the Suns Fyre");
            }
        }
        public void turnOff () {
            if (!GlowElement.getStatus) {
                GlowElement.getStatus = true;
                System.out.println(GlowElement.name + " going dark");
            } else {
                System.out.println(GlowElement.getName() + " already sleeping");
            }
        }
    }


}

/*
private List<Tyre> tyres;

this.tyres = new ArrayList<>();

public void addTyre(Tyre tyre){
    this.tyres.add(tyre);
}
 */