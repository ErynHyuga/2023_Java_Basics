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



}

/*
private List<Tyre> tyres;

this.tyres = new ArrayList<>();

public void addTyre(Tyre tyre){
    this.tyres.add(tyre);
}
 */