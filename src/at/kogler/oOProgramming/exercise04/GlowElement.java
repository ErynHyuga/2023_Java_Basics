package at.kogler.oOProgramming.exercise04;

public class GlowElement {
    private String name;
    private String colour;
    private int energieConsumption;
    private boolean status;

    public GlowElement(String name, String colour, int energieConsumption, boolean status) {
        this.name = name;
        this.colour = colour;
        this.energieConsumption = energieConsumption;
        this.status = status;
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
