package car;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;
    private Engine engine;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    final double TAX = 0.15;

    public Vehicle(String name,double price,int speed,int qty,Engine engine) {
        super(name);
        this.price = price;
        this.speed = speed;
        this.qty = qty;
        this.engine = engine;
    }

    public double totalBeforeTax(){
        return price * qty;
    }

    public double calcTax(Vehicle vehicle){
        return TAX * vehicle.getPrice();
    }

    abstract void totalAfterTax(Vehicle vehicle);

    public double getPrice() {
        return price;
    }
}
