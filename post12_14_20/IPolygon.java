package logicblocks.post12_14_20;

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
}