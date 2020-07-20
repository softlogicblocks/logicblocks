package logicblocks.post6_24_20;

public class Circle extends Shape {
    // Checks whether the circle is an ellipse
    private boolean isEllipse() {
        if(width != height) return true;
        else return false;
    }
    // Returns the text telling what shape it is
    public String whatShape() {
        String sh = "";
        if(isEllipse()) sh = "Ellipse";
        else sh = "Circle";
        return sh;
    }

    // Returns the area of the shape - can access parent's declared variables
    public double area() {
        double xradius = width / 2;
        double yradius = height / 2;
        return Math.round(PI * xradius * yradius * 100) / 100.0;
    }
}
