package at.kogler.oOProgramming.exercise01.CarParts;

public class RearMirror {
    private int size;
    private String side;
    private int position;

    public void RearMirror(String side, int size, int position) {
        this.side = side;
        this.position = position;
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
