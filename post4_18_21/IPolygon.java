package logicblocks.post4_18_21;

// Interface Polygon gives structure of the methods needed to work with any polygon
// Every class implementing this interface should have all the methods
public interface IPolygon {
    // Returns the text telling what shape it is
    public String whatShape();

    // Returns the numbers of sides
    public int noOfSides();

    // Returns the array of lengths of all sides
    public double[] getSides();

    // Returns the area of the shape
    public double area();

    // Returns the perimeter of the shape
    public double perimeter();

    default public void printShapeDetails() {
        System.out.println("Shape is " + whatShape());
        System.out.println("Total Sides are " + noOfSides());
        System.out.println("Sides are: ");
        double sides[] = getSides();
        for(int i = 0; i < getSides().length; i++) {
            System.out.print("Side " + (i+1) + ": " + sides[i] + "; ");
        }
        System.out.println();
        System.out.println("Area is " + area());
        System.out.println("Perimeter is " + perimeter());
        System.out.println();
    }
}
