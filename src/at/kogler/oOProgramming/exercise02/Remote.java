package at.kogler.oOProgramming.exercise02;

import java.util.List;
import java.util.ArrayList;

public class Remote {
    private List<Battery> batteryList = new ArrayList<>();
    private int batteryStatus;
    public void addBattery(Battery battery){
        this.batteryList.add(battery);
    }

    public int getBatteryStatus() {
        int sum = 0;
        for (Battery battery : this.batteryList) {
            sum += battery.getStatus();
        }
        if (batteryList.size() > 0) {
            return sum / this.batteryList.size();
        } else {
            return 0;
        }
    }
    public void turnOff(){
        System.out.println("Kein Verbraucher Angeschlossen");
    }
    public void turnOn() {
        batteryStatus -= 5;
        System.out.println(batteryStatus);
        System.out.println("Verbraucher Angeschlossen");
    }
}