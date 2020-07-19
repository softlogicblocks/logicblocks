package logicblocks.post6_23_20;

public class Circle extends Shape {
    // Returns the text telling what shape it is
    public String whatShape() {
        return "Circle";
    }

    // Returns the area of the shape - can access parent's declared variables
    public double area() {
        double radius = width / 2;
        return Math.round(PI * radius * radius * 100) / 100.0;
    }
}
