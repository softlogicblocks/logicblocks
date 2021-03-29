package logicblocks.post3_29_21;

// Implementation of Outer Interface
public class OuterInterfaceClass implements OuterInterface {
    public void display() {
        System.out.println("Display method from OuterInterfaceClass");
    }

    public void showInner(InnerInterface i) {
        System.out.println("Show method from OuterInterfaceClass");
        i.display();
    }
}
