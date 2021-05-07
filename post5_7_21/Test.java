package logicblocks.post5_7_21;

public class Test implements IPrivate{
    public void msg() {
        //message();
        System.out.println("In implementing class method");
    }

    static public void main(String args[]) {
        Test test = new Test();
        test.callMessage();
    }
}
