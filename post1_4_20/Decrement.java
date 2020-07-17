package logicblocks.post1_4_20;

public class Decrement {
    public static void main(String args[]) {
        int y = 90;

        System.out.println("Decrement Operator");

        // Original Value
        System.out.println("y   = " + y);

        // Post decrement operator
        System.out.println("y-- = " + y--);

        // After post decrement
        System.out.println("y   = " + y);

        // Pre decrement operator
        System.out.println("--y = " + --y);

        // After pre decrement
        System.out.println("y   = " + y);
    }
}
