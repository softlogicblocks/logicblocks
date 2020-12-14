package logicblocks.post12_12_20;

// Class Triangle implementing the interface IPolygon
public class Triangle implements IPolygon {
    final int noOfSides = 3;
    double side1;
    double side2;
    double side3;
    double perimeter;
    double area;

    // Triangle Constructor with no arguments
    Triangle() {
        this.side1 = 4;
        this.side2 = 4;
        this.side3 = 4;
    }

    // Triangle Constructor with three arguments
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Triangle";
    }

    // Returns the numbers of sides
    public int noOfSides() {
        return noOfSides;
    }

    // Returns the array of lengths of all sides
    public double[] getSides() {
        double arrSides[] = new double[3];
        arrSides[0] = side1;
        arrSides[1] = side2;
        arrSides[2] = side3;
        return arrSides;
    }

    // Returns the area of the triangle
    public double area() {
        double p, diff1, diff2, diff3, pr;
        p = perimeter / 2;
        diff1 = p - side1;
        diff2 = p - side2;
        diff3 = p - side3;
        pr = p * diff1 * diff2 * diff3;
        area = Math.round(Math.sqrt(pr) * 100) / 100.0;
        return area;
    }

    // Returns the perimeter of the triangle
    public double perimeter() {
        perimeter = Math.round((side1 + side2 + side3) * 100) / 100.0;
        return perimeter;
    }
}
