package at.kogler.oOProgramming.Exercise01.CarParts;

public class Tyre {
    private int profileDepth;
    private int size;
    private double pressure;

    public Tyre(int profileDepth, int size, double pressure) {
        this.profileDepth = profileDepth;
        this.size = size;
        this.pressure = pressure;
    }

    public int getProfileDepth() {
        return profileDepth;
    }

    public int getSize() {
        return size;
    }

    public double getPressure() {
        return pressure;
    }
}
