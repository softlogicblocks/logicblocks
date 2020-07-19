package logicblocks.post6_23_20;

public class Rectangle extends Shape {
    // Returns the text telling what shape it is
    public String whatShape() {
        return "Rectangle";
    }

    // Returns the area of the shape - can access parent's declared variables
    public double area() {
        return Math.round(height * width * 100) / 100.0;
    }
}
