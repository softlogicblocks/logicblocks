package logicblocks.post8_1_20;

public class Vehicle {
    private String vehicleType;
    private String vehicleColor;
    private int noOfWheels = 0;

    // Class Wheel Starts
    class Wheel {
        String wheelType;
        int wheelSize;

        Wheel(String type, int size) {
            wheelType = type;
            wheelSize = size;
            noOfWheels++;
        }

        String getType() {
            return this.wheelType;
        }

        void setType(String type) {
            this.wheelType = type;
        }

        int getSize() {
            return this.wheelSize;
        }

        void setSize(int size) {
            this.wheelSize = size;
        }
    }
    // Class Wheel Ends

    Vehicle(String type, String color) {
        vehicleType = type;
        vehicleColor = color;
    }

    String getType() {
        return this.vehicleType;
    }

    String getColor() {
        return this.vehicleColor;
    }

    void setType(String type) {
        this.vehicleType = type;
    }

    void setColor(String color) {
        this.vehicleColor = color;
    }

    int getNoOfWheels() {
        return this.noOfWheels;
    }
}
