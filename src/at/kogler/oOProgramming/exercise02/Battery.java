package at.kogler.oOProgramming.exercise02;


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
