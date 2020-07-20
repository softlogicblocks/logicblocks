package logicblocks.post7_10_20;

public class ExplicitTypeConvert {
    public static void main(String args[]) {
        byte b = 100;
        //byte b2 = b * 3;
        int i = b * 3;
        byte b2 = (byte)(b * 3);
        System.out.println("b: " + b);
        System.out.println("i: " + i);
        System.out.println("b2: " + b2); // data loss

        int i2 = i / 7;
        double d1 = i / 7;

        System.out.println("i2: " + i2);
        System.out.println("d1: " + d1);

        double d2 = i / 7.0;
        double d3 = (double)i / 7;

        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
    }
}
