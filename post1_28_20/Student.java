package logicblocks.post1_28_20;

public class Student {
    String name;
    int age;
    static int total = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
    }
}
