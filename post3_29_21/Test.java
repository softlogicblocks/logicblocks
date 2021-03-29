package logicblocks.post3_29_21;

// Demo class showing accessing inner interface in all three ways
public class Test {
    public static void main (String args[]) {
        // Creates a an object of class implementing OuterInterface
        OuterInterfaceClass oic = new OuterInterfaceClass();
        oic.display();
        System.out.println("___________________________________________________");

        // Creates a an object of class implementing InnerInterface
        InnerInterfaceClass iic = new InnerInterfaceClass();
        iic.display();
        System.out.println("___________________________________________________");

        // Creates a a variable of inner interface and assign the class variable By Reference
        OuterInterface.InnerInterface oiii;
        oiii = iic;
        oiii.display();
        System.out.println("___________________________________________________");
        // Calls the outer interface method which accesses inner interface
        oic.showInner(iic);
    }
}
