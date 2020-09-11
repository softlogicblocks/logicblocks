package logicblocks.post9_11_20;

public class ShapesTest {
    public static void main(String args[]) {
        // Created a triangle shape
        Triangle t = new Triangle(4, 6, "Yellow");
        System.out.println(t.width);
        System.out.println(t.height);
        System.out.println(t.fillColor);
        t.setDiffColor("Green","Pink");
        System.out.println(t.fillColor);
        System.out.println(t.borderColor);
    }
}
