package logicblocks.post1_27_20;

import java.awt.*;

public class Dog {
    int age;
    int size;
    Color color;
    String colorName;

    Dog(int age, int size, Color color) {
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public void bark() {
        System.out.println("Bark - woof, woof");
    }

    public Color getColor() {
        return this.color;
    }
}
