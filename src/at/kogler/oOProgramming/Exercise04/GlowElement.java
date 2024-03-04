package at.kogler.oOProgramming.Exercise04;

public class GlowElement {
    public static boolean getStatus;
    public static String name;
    public static int getEnergieConsumption;
    private String colour;
    private int energieConsumption;
    private boolean status;

    public GlowElement(String name, String colour, int energieConsumption) {
        name = this.name;
        this.colour = colour;
        this.energieConsumption = energieConsumption;

    }



    public void turnAllOn() {
        if (!status) {
            status = true;
            System.out.println(name + " is setting light on fire");
            energieConsumption += 5;
        } else {
            System.out.println("I'm " + name + ", Shining Bright as the Suns Fyre");
        }
    }

    public String getColour() {
        return colour;
    }

    public static String getName() {
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
