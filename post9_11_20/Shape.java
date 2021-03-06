package logicblocks.post9_11_20;

public abstract class Shape {
    final static double PI = Math.PI;
    double width = 0;
    double height = 0;
    String borderColor = "Blue";

    // Superclass constructors
    Shape() {
        this.width = 5;
        this.height = 8;
    }

    Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "";
    }

    // Returns the area of the shape
    public abstract double area();

    public void setColor(String color) {
        this.borderColor = color;
    }
}
