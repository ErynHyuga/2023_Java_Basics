package at.kogler.oOProgramming.exercise01.CarParts;

public class CarTyre {
    private int profileDepth;
    private int size;
    private int pressure;

    public CarTyre(int profileDepth, int size, double pressure) {
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

    public int getPressure() {
        return pressure;
    }
}
