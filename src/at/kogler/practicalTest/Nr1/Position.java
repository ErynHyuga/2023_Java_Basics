package at.kogler.practicalTest.Nr1;

public class Position {
    private int longitude;
    private int lattitude;

    public Position(int longitude, int lattitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLattitude() {
        return lattitude;
    }
}