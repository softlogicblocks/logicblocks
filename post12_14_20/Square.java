package logicblocks.post12_14_20;

// Class Square subclass of class Quadrilateral
public class Square extends Quadrilateral {
    double side;
    double perimeter;
    double area;

    // Square Constructor with no arguments
    Square() {
        this.side = 6;
    }

    // Square Constructor with three arguments
    Square(double side) {
        this.side = side;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Square";
    }

    // Returns the array of lengths of all sides
    public double[] getSides() {
        double arrSides[] = new double[4];
        arrSides[0] = side;
        arrSides[1] = side;
        arrSides[2] = side;
        arrSides[3] = side;
        return arrSides;
    }

    // Returns the area of the Square
    public double area() {
        double pr;
        pr = side * side;
        area = Math.round(pr * 100) / 100.0;
        return area;
    }

    // Returns the perimeter of the Square
    public double perimeter() {
        perimeter = Math.round(4 * side * 100) / 100.0;
        return perimeter;
    }
}
