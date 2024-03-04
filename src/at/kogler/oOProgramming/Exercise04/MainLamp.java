package at.kogler.oOProgramming.Exercise04;

public class MainLamp {
    public static void main(String[] args) {
        GlowElement g1 = new GlowElement("g1", "blue", 12);
        GlowElement g2 = new GlowElement("g2", "red", 7);
        GlowElement g3 = new GlowElement("g3", "green", 5);

        Lamp lamp = new Lamp();
        lamp.addGlowElement(g1);
        lamp.addGlowElement(g2);
        lamp.addGlowElement(g3);
        lamp.turnOff();
        lamp.turnAllOn(g1);

        g1.getEnergieConsumption();


    }




}

