package at.kogler.oOProgramming.exercise04;

public class GlowElement {
    private String name;
    private String colour;
    private int energieConsumption;
    private boolean status;

    public GlowElement(String name, String colour, int energieConsumption) {
        this.name = name;
        this.colour = colour;
        this.energieConsumption = energieConsumption;
    }

    public void turnOff() {
        status = false;
    }
    int sum = 0;
    public void turnAllOn() {

        if (!status) {
            status = true;
            System.out.println("Setting light on fire (WARNING: This is a dangerous action and should not be attempted in real life!)");
            energieConsumption += 5;
        } else {
            System.out.println("I'm " + name + ", Shining Bright as the Suns Fyre");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnergieConsumption() {
        return energieConsumption;
    }

    public void setEnergieConsumption(int energieConsumption) {
        this.energieConsumption = energieConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
