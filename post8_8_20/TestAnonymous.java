package logicblocks.post8_8_20;

public class TestAnonymous {
    public static void main(String[] args) {
        System.out.println("We are in main class");
        int finalInt = 10;
        // Accessed from anonymous class so can not be changed
        //finalInt++;
        Simple s = new Simple(); // Used as normal class
        s.printText();
        Simple as = new Simple() { // Used as anonymous class
            void printText() {
                System.out.println("This is text from anonymous class!!");
                anotherMethod();
            }

            void anotherMethod() {
                System.out.println("Final Value : " + finalInt);
                System.out.println("Another Method from anonymous class!!");
            }
        };
        as.printText();
        // Can not access non-overridden methods from the anonymous class
        // as.anotherMethod();

        // Accessed from anonymous class so can not be changed
        // finalInt++;
    }
}
