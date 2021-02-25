package logicblocks.post2_25_21;

// Class KeyboardDemo for demo of all three classes
public class KeyboardDemo {
    public static void main(String args[]) {
        // Create an object of non-static inner class AlphaKeys
        Keyboard.AlphaKeys ak = new Keyboard().new AlphaKeys();
        // Above statement is same as -
        /*
        Keyboard k = new Keyboard();
        AlphaKeys ak = k.new AlphaKeys();
         */
        ak.hold();
        ak.press();

        // Create an object of static inner class FuncKeys
        Keyboard.FuncKeys fk = new Keyboard.FuncKeys();
        fk.hold();
        fk.press();

        // Create an object of class NumKeys, which is not inner class
        NumKeys nk = new NumKeys();
        nk.hold();
        nk.press();
    }
}
