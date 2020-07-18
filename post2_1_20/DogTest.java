package logicblocks.post2_1_20;

import java.awt.*;

public class DogTest {
    public static void main(String args[]) {
        Dog dog1 = new Dog("Tommy", "Bulldog",3, 4, Color.WHITE);

        dog1.getDogDetails();
        dog1.bark();
    }
}
