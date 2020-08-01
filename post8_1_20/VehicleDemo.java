package logicblocks.post8_1_20;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle v = new Vehicle("Truck", "red");
        System.out.println("Type of Vehicle is: " + v.getType());
        System.out.println("Color of Vehicle is: " + v.getColor());
        Vehicle.Wheel wh1 = v.new Wheel("thick", 28);
        Vehicle.Wheel wh2 = v.new Wheel("thick", 28);
        System.out.println("No Of Wheels: " + v.getNoOfWheels());
        Vehicle.Wheel wh3 = v.new Wheel("thin", 15);
        Vehicle.Wheel wh4 = v.new Wheel("thin", 15);
        System.out.println("No Of Wheels: " + v.getNoOfWheels());
    }
}
