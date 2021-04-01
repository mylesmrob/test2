package car;

public class Truck extends Vehicle implements DriveAble{
    final double TAX = 0.20;

    public Truck(String name,double price,int speed,int qty,Engine engine) {
        super(name,price,speed,qty,engine);
    }

    @Override
    public int milesPerHour() {
        return this.getSpeed();
    }

    @Override
    void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.totalBeforeTax() + (TAX * vehicle.getPrice()));
    }
}
