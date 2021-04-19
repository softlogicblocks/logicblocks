package logicblocks.post4_18_21;

// Class Rectangle implementing the interface IPolygon
public class Rectangle implements IPolygon {
    final int noOfSides = 4;
    double side1;
    double side2;
    double perimeter;
    double area;

    // Rectangle Constructor with no arguments
    Rectangle() {
        this.side1 = 4;
        this.side2 = 4;
    }

    // Rectangle Constructor with three arguments
    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Rectangle";
    }

    // Returns the numbers of sides
    public int noOfSides() {
        return noOfSides;
    }

    // Returns the array of lengths of all sides
    public double[] getSides() {
        double arrSides[] = new double[4];
        arrSides[0] = side1;
        arrSides[1] = side2;
        arrSides[2] = side1;
        arrSides[3] = side2;
        return arrSides;
    }

    // Returns the area of the rectangle
    public double area() {
        double pr;
        pr = side1 * side2;
        area = Math.round(pr * 100) / 100.0;
        return area;
    }

    // Returns the perimeter of the rectangle
    public double perimeter() {
        perimeter = Math.round((2 * (side1 + side2)) * 100) / 100.0;
        return perimeter;
    }
}
