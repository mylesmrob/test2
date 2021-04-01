package car;

public class MotorBike extends Vehicle{
    private int numOfWheels;

    public MotorBike(String name,double price,int speed,int qty,Engine engine,int numOfWheels) {
        super(name,price,speed,qty,engine);
        this.numOfWheels = numOfWheels;
    }

    @Override
    void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.totalBeforeTax() + vehicle.calcTax(vehicle));
    }
}
