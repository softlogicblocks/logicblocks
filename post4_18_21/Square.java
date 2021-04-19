package logicblocks.post4_18_21;

// Class Square implementing the interface IPolygon
public class Square implements IPolygon {
    final int noOfSides = 4;
    double side;
    double perimeter;
    double area;

    // Square Constructor with no arguments
    Square() {
        this.side = 4;
    }

    // Square Constructor with one argument
    Square(double side) {
        this.side = side;
    }

    // Returns the text telling what shape it is
    public String whatShape() {
        return "Square";
    }

    // Returns the numbers of sides
    public int noOfSides() {
        return noOfSides;
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

    // Returns the area of the square
    public double area() {
        double pr;
        pr = side * side;
        area = Math.round(pr * 100) / 100.0;
        return area;
    }

    // Returns the perimeter of the square
    public double perimeter() {
        perimeter = Math.round((4 * side) * 100) / 100.0;
        return perimeter;
    }

    public void printShapeDetails() {
        System.out.println("Shape is " + whatShape());
        System.out.println("Total Sides are " + noOfSides());
        System.out.println("Sides of the square are: " + this.side);
        System.out.println("Area is " + area());
        System.out.println("Perimeter is " + perimeter());
        System.out.println();
    }
}
