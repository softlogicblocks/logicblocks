package logicblocks.post8_10_20;

public class StaticClassDemo {
    static int staticInt = 5;
    int noStaticInt = 5;
    static class staticInnerClass {
        staticInnerClass() {
            System.out.println("Creating Static Inner Class");
        }

        void printText() {
            System.out.println("Inside Static Inner Class");
        }

        void getOuterClassData() {
            System.out.println("Outer Class Static Variable staticInt = " + staticInt);

            // Can't access non-static members
            //System.out.println("Outer Class Non-Static Variable noStaticInt " + noStaticInt);
        }
    }

    public static void main(String[] args) {
        StaticClassDemo.staticInnerClass stClass = new StaticClassDemo.staticInnerClass();

        stClass.printText();
        stClass.getOuterClassData();
    }
}
