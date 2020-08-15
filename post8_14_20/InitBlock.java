package logicblocks.post8_14_20;

public class InitBlock {
    int x;
    int y;
    static int z;

    {
        System.out.println("Initialization Block");
        x = 10;
        y = 15 + x;
        z = 20;
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
    }
}
