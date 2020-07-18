package logicblocks.post6_12_20;

public class CallByVal {
    public static void main(String args[]) {
        int i = 5;

        System.out.println("Original Value: " + i);

        int y = doubleVal(i);

        System.out.println("After Method Called: " + i);
        System.out.println("Doubled Value: " + y);

    }

    public static int doubleVal(int x) {
        x = x * 2;
        return x;
    }
}
