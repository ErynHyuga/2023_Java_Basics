package at.kogler.oOProgramming.exercise02;

public class RemoteMain {

    public static void main(String[] args) {

        Remote remote = new Remote();
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);

        remote.addBattery(b1);
        remote.addBattery(b2);

        System.out.println(remote.getBatteryStatus());
        remote.turnOn();
        remote.turnOff();
        System.out.println(remote.getBatteryStatus());
    }
}
