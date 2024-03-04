package at.kogler.oOProgramming.Exercise01.CarParts;

public class Mirror {
    private int size;
    private String side;
    private int position;

    public Mirror(int size, String side, int position) {
        this.size = size;
        this.side = side;
        this.position = position;
    }

    public String getSide() {
        return side;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}