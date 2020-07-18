package logicblocks.post2_1_20;

import java.awt.*;

public class Dog {
    String name;
    String type;
    int age;
    int size;
    Color color;
    String colorName;

    Dog(String name, String type, int age, int size, Color color) {
        this.name = name;
        this.type = type;
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

    public void getDogDetails() {
        System.out.println("Dog's Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age : " + age);
        System.out.println("Size: " + size);
    }
}
