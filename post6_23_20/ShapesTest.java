package logicblocks.post6_23_20;

public class ShapesTest {
    public static void main(String args[]) {
        // Created an array of 3 shapes
        Shape shapes[] = new Shape[3];

        // Created 3 instances of 3 child classes
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();
        System.out.println("Shapes Test");

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].height = 5;
            shapes[i].width = 9;

            // Called the methods through parent's reference (Compiler doesn't know which object's method is called)
            // At run-time decision is made, which class method is called
            System.out.println("Shape is " + shapes[i].whatShape());
            System.out.println("Area is " + shapes[i].area());
            System.out.println("");
        }
    }
}
