package logicblocks.post12_14_20;

// Class for testing the interface IPolygon and its implementing classes
public class PolygonTest {
    public static void main(String args[]) {
        IPolygon P[] = new IPolygon[4];
        P[0] = new Square(9);
        P[1] = new Rectangle(18, 11);
        P[2] = new Trapezoid(7, 5, 8, 6, 4);
        P[3] = new Trapezoid();

        for(int i = 0; i < P.length; i++) {
            System.out.println("Polygon " + (i+1) + " is " + P[i].whatShape());
            System.out.println("No of sides: " + P[i].noOfSides());
            double allSides[] = P[i].getSides();
            System.out.print("All sides are : ");
            for(int j = 0; j < allSides.length; j++) {
                System.out.print("Side" + (j+1) + ": " + allSides[j] + "   ");
            }
            System.out.println();
            System.out.println("Perimeter is : " + P[i].perimeter());
            System.out.println("Area is : " + P[i].area());
            System.out.println();
        }
    }
}