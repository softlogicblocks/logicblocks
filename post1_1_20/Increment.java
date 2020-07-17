package logicblocks.post1_1_20;

public class Increment {
    public static void main(String args[]) {
        int x = 20;

        System.out.println("Increment Operator");

        // Original Value x = 20
        System.out.println("x   = " + x);

        // Post increment operator x = 20; print; x = 21
        System.out.println("x++ = " + x++);

        // After post increment x = 21
        System.out.println("x   = " + x);

        // Pre increment operator x = 22
        System.out.println("++x = " + ++x);

        // After pre increment
        System.out.println("x   = " + x);
    }
}
