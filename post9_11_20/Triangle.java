package logicblocks.post9_11_20;

public class Triangle extends Shape {
    String fillColor;
    // Triangle Constructor with no arguments
    Triangle() {
        super();
        this.fillColor = "Red";
    }

    // Triangle Constructor with one argument
    Triangle(String fillColor) {
        super();
        this.fillColor = fillColor;
    }

    // Triangle Constructor with three arguments
    Triangle(double width, double height, String fillColor) {
        super(width, height);
        this.fillColor = fillColor;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Triangle";
    }

    // Returns the area of the shape - can access parent's declared variables
    public double area() {
        return Math.round((height * width / 2) * 100) / 100.0;
    }

    public void setColor(String color) {
        super.setColor(color);
        this.fillColor = color;
    }

    public void setDiffColor(String fillcolor, String bordercolor) {
        this.fillColor = fillcolor;
        super.setColor(bordercolor);
    }
}
