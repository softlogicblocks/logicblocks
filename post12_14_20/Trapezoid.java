package logicblocks.post12_14_20;

// Class Trapezoid subclass of class Quadrilateral
public class Trapezoid extends Quadrilateral {
    double side1;
    double side2;
    double lbase; // Long Base
    double sbase; // Short Base
    double height; // Height of trapezoid
    double perimeter;
    double area;

    // Trapezoid Constructor with no arguments
    Trapezoid() {
        this.side1 = 15;
        this.side2 = 20;
        this.lbase = 55;
        this.sbase = 30;
        this.height = 12;
    }

    // Trapezoid Constructor with four arguments
    Trapezoid(double side1, double side2, double lbase, double sbase, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.lbase = lbase;
        this.sbase = sbase;
        this.height = height;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Trapezoid";
    }

    // Returns the array of lengths of all sides
    public double[] getSides() {
        double arrSides[] = new double[4];
        arrSides[0] = side1;
        arrSides[1] = side2;
        arrSides[2] = lbase;
        arrSides[3] = sbase;
        return arrSides;
    }

    // Returns the area of the Trapezoid
    public double area() {
        double pr;
        pr = (lbase + sbase) / 2 * height;
        area = Math.round(pr * 100) / 100.0;
        return area;
    }

    // Returns the perimeter of the Trapezoid
    public double perimeter() {
        perimeter = side1 + side2 + lbase + sbase;
        perimeter = Math.round(perimeter * 100) / 100.0;
        return perimeter;
    }
}
