package at.kogler.oOProgramming.exercise01.CarParts;

public class RearMirror {
    private int size;
    private String side;
    private int position;

    public RearMirror(int size, String side, int position) {
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