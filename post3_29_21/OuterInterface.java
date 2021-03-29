package logicblocks.post3_29_21;

// Outer Interface
public interface OuterInterface {
    public void display();
    public void showInner(InnerInterface i);

    // Inner Interface
    public interface InnerInterface {
        public void display();
    }
}
