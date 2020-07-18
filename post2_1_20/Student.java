package logicblocks.post2_1_20;

public class Student {
    String name;
    int age;
    static int total = 0;
    static int gr8Total = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
        if(age >= 8) gr8Total++;
    }
}
