package at.kogler.oOProgramming.Exercise03;

public class Car {
    private int kmCounter;
    private String colour;
    private int maxSpeed;
    private int basePrice;
    private double baseConsumption;
    private Engine engine;
    private Manufacturer discount;
    private Manufacturer manufacturer;
    private int price;




    ;


    public Car(int kmCounter, String colour, int maxSpeed, int basePrice, double baseConsumption, Engine engine, Manufacturer manufacturer){
        this.kmCounter = kmCounter;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.engine = engine;
        this.manufacturer = manufacturer;
        discount();
        if (this.kmCounter < 50000){
            this.baseConsumption = this.baseConsumption;
        }
        else {
            this.baseConsumption = this.baseConsumption * 1.098;
        }
    }
    public void discount() {
        double newPrice = this.basePrice * this.manufacturer.getDiscount();
        System.out.println("New price for the car: " + newPrice);
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public int getPrice() {
        return price;
    }

}
