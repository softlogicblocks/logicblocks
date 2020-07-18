package logicblocks.post1_29_20;

public class StaticDemo {
    static String hello = "Hello";
    public static void main(String args[]) {
        sayHello1();
        StaticDemo sd = new StaticDemo();
        sd.sayHello2();
    }

    static void sayHello1 () {
        System.out.println("Say " + hello);
    }

    void sayHello2 () {
        System.out.println("Say " + hello);
    }
}
