package logicblocks.post8_19_20;

public class ShapesTest {
    public static void main(String args[]) {
        // Created a triangle shape
        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle("Blue");

        Triangle triangle3 = new Triangle(4, 6, "Purple");

        System.out.println(triangle1.whatShape());
        System.out.println(triangle1.width);
        System.out.println(triangle1.height);
        System.out.println(triangle1.fillColor);

        System.out.println();
        System.out.println(triangle2.whatShape());
        System.out.println(triangle2.width);
        System.out.println(triangle2.height);
        System.out.println(triangle2.fillColor);

        System.out.println();
        System.out.println(triangle3.whatShape());
        System.out.println(triangle3.width);
        System.out.println(triangle3.height);
        System.out.println(triangle3.fillColor);
    }
}
