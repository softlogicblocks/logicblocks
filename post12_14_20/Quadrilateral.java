package logicblocks.post12_14_20;

// Abstract Class Quadrilateral implementing the class IPolygon
public abstract class Quadrilateral implements IPolygon {
    final int noOfSides = 4;

    public int noOfSides() {
        return noOfSides;
    }
}
