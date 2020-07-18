package logicblocks.post6_21_20;

public class AccessTest1 {
    public static void main(String args[]) {
        AccessMod1 am = new AccessMod1();

        // It can access directly as the variable is public
        System.out.println("Calling From Main Class: " + am.num);

        // It can access directly to the method as it is public
        am.printNum();
        System.out.println();

        // Public variables can be changed directly
        am.num = 15;
        System.out.println("Calling From Main Class: " + am.num);
        am.printNum();
    }
}
