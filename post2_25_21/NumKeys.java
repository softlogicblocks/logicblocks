package logicblocks.post2_25_21;

// Class NumKeys implementing the interface KeyAction
public class NumKeys implements Keyboard.KeyAction {
    NumKeys() {
        System.out.println("");
        System.out.println("Numeric Keys");
    }

    public void hold() {
        System.out.println("Holding the Numeric keys");
    }

    public void press() {
        System.out.println("Pressing the Numeric keys");
    }
}
