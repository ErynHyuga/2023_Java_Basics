package at.kogler.oOProgramming.Exercise03;

public class Manufacturer {

    private String name;
    private String origin;
    private double discount;

    public Manufacturer(String name, String origin, double discount) {
        this.name = name;
        this.origin = origin;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public double getDiscount() {
        return discount;
    }


}