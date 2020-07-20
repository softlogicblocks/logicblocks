package logicblocks.post7_16_20;

public class Dog {
    int age;
    int size;
    String colorName;

    Dog(int age, int size, String colorName) {
        this.age = age;
        this.size = size;
        this.colorName = colorName;
    }

    public int getAge() {
        return this.age;
    }

    public void bark() {
        System.out.println("Bark - woof, woof");
    }

    public String getColor() {
        return this.colorName;
    }
}
