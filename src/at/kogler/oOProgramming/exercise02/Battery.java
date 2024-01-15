package at.kogler.oOProgramming.exercise02;

public class Battery {
    private int battaryStatus;

    public Battery(int battaryStatus){
        this.battaryStatus = battaryStatus;
    }
    public int getStatus(){
        return battaryStatus;
    }
    public String turnOff(){
        return "Kein Verbraucher Angeschlossen";
    }
    public String turnOn() {
        return "Verbraucher Angeschlossen";
    }
}
