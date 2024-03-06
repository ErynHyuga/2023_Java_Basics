package at.kogler.oOProgramming.Exercise04;

public class GlowElement {

    private String colour;
    private int energieConsumption;
    private boolean status;
    private String name;

    public GlowElement(String name, String colour, int energieConsumption) {
        name = this.name;
        this.colour = colour;
        this.energieConsumption = energieConsumption;

    }




    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnergieConsumption() {
        System.out.println(energieConsumption);
        return energieConsumption;
    }

    public void setEnergieConsumption(int energieConsumption) {
        this.energieConsumption = energieConsumption;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
