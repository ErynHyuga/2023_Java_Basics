package at.kogler.oOProgramming.Exercise06;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }
    public void viennaCalling(String number){
        System.out.println("calling Number" + number);
    }

}
