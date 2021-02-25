package logicblocks.post2_25_21;

// Class Keyboard which has interface KeyAction declared in the class itself
public class Keyboard {
    // Declared the interface KeyAction
    interface KeyAction {
        void hold();
        void press();
    }

    // Non-static Class AlphaKeys implementing the interface KeyAction
    class AlphaKeys implements KeyAction {
        AlphaKeys() {
            System.out.println("");
            System.out.println("Alphabet Keys");
        }

        public void hold() {
            System.out.println("Holding the alphabet keys");
        }

        public void press() {
            System.out.println("Pressing the alphabet keys");
        }
    }

    // Static Class FuncKeys implementing the interface KeyAction
    static class FuncKeys implements KeyAction {
        FuncKeys() {
            System.out.println("");
            System.out.println("Function Keys");
        }

        public void hold() {
            System.out.println("Holding the function keys");
        }

        public void press() {
            System.out.println("Pressing the function keys");
        }
    }
}
