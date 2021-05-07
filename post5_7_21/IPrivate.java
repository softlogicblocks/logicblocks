package logicblocks.post5_7_21;

public interface IPrivate {
    public void msg();

    default public void callMessage() {
        message();
    }

    private void message() {
        System.out.println("In private Method");
    }
}
