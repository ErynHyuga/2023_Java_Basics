package at.kogler.oOProgramming.exercise04;

import at.kogler.oOProgramming.exercise01.CarParts.Mirror;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<GlowElement> glowElementsList;

    public Lamp() {
        this.glowElementsList = new ArrayList<>();
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