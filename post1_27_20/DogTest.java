package logicblocks.post1_27_20;

import java.awt.*;

public class DogTest {
    public static void main(String args[]) {
        Dog dog1 = new Dog(3, 4, Color.WHITE);

        int a = dog1.age;
        int b = dog1.size;

        System.out.println("Dog's age: " + a);
        System.out.println("Dog's size: " + b);

        a = dog1.getAge();

        System.out.println("Dog's age: " + a);

        dog1.bark();
    }
}
