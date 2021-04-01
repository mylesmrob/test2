package car;

public class Car extends Vehicle implements DriveAble{

    public Car(String name,double price,int speed,int qty,Engine engine) {
        super(name,price,speed,qty,engine);
    }

    @Override
    void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.totalBeforeTax() + vehicle.calcTax(vehicle));
    }

    @Override
    public int milesPerHour() {
        return this.getSpeed();
    }
}
