package at.kogler.oOProgramming.exercise03;

public class Car {

    private String colour;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumption;
    private String manufacturer;
    private Engine engine;


    public Car(String colour, int maxSpeed, int basePrice, int baseConsumption, String manufacturer, Engine engine){
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
        
    }
    
}
