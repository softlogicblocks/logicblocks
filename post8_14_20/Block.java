package logicblocks.post8_14_20;

public class Block {
    public static void main(String args[]) {
        int x = 10;
        String str = "Block Example";
        System.out.println("Value of x is : " + x);
        System.out.println("This is : " + str);
        {
            int y = x + 5;
            System.out.println("This is inside the block");
        }
        // System.out.println("Value of y is : " + y);
    }
}
