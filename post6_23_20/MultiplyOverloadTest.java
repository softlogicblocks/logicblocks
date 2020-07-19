package logicblocks.post6_23_20;

public class MultiplyOverloadTest {
    public static void main(String args[]) {
        MultiplyOverload mo = new MultiplyOverload();

        System.out.println("9 * 8 = " + mo.multiply(9, 8)); // Calls first method
        System.out.println("9.25 * 8 = " + mo.multiply(9.25, 8)); // Calls second method
        System.out.println("9.25 * 8.75 = " + mo.multiply(9.25, 8.75)); // Calls third method
        System.out.println("round(9.25 * 8.75) = " + mo.multiply(9.25, 8.75, true)); // Calls fourth method
    }
}
