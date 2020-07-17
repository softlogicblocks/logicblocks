package logicblocks.post1_11_20;

public class BitTest {
    public static void main(String args[]) {
        int number = 100;
        int shiftBy = 2;

        int rightShift = number >> shiftBy;
        int leftShift = number << shiftBy;

        System.out.println("Number: " + number);
        System.out.println("Shifted By " + shiftBy + " bits");

        System.out.println();

        System.out.println("Right Shift: " + rightShift);

        System.out.println("Left Shift: " + leftShift);
    }
}
