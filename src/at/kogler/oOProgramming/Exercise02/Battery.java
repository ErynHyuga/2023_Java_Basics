package at.kogler.oOProgramming.Exercise02;


public class Battery {
    private int batteryStatus;

    public Battery(int batteryStatus){
        this.batteryStatus = batteryStatus;
    }
    public int getStatus(){
        return batteryStatus;
    }

    public void setNewStatus(int value){
        this.batteryStatus = value;
    }
}
