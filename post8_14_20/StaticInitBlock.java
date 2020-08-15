package logicblocks.post8_14_20;

public class StaticInitBlock {
    int x;
    int y;
    static int z;

    static {
        System.out.println("Static Initialization Block");
        // x = 10;
        // y = 15 + x;
        z = 20;
        // System.out.println("Value of x is: " + x);
        // System.out.println("Value of y is: " + y);
        System.out.println("Values x and y are not accessible in static block");
    }
}
