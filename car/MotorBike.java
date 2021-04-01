package car;

public class MotorBike extends Vehicle{
    private int numOfWheels;

    public MotorBike(String name,double price,int speed,int qty,Engine engine) {
        super(name,price,speed,qty,engine);
    }

    @Override
    void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.totalBeforeTax() + vehicle.CalcTax(vehicle));
    }
}
