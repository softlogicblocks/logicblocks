package logicblocks.post6_21_20;

public class AccessTest2 {
    public static void main(String args[]) {
        AccessMod2 am = new AccessMod2();

        // It can not access directly as the variable is private
        // System.out.println("Calling From Main Class: " + am.num);

        // It can access directly to the method as it is public
        am.printNum();
        System.out.println();

        // Private variables can not be changed directly
        // am.num = 15;
        // Private variables can only changed indirectly by the class methods
        am.changeNum();

        // This time private method is called internally, which can't be called directly
        // am.showMsg();
        am.printNum();
    }
}
