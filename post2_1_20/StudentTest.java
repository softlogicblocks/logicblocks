package logicblocks.post2_1_20;

public class StudentTest {
    public static void main(String args[]) {
        Student s1 = new Student("John", 6);
        Student s2 = new Student("Adam", 9);
        Student s3 = new Student("Alex", 7);
        System.out.println("Student1 -");
        System.out.print("Name  : " + s1.name + ", ");
        System.out.print("age   : " + s1.age + ", ");
        System.out.println("");

        System.out.println("Student2 -");
        System.out.print("Name  : " + s2.name + ", ");
        System.out.print("age   : " + s2.age + ", ");
        System.out.println("");

        System.out.println("Student3 -");
        System.out.print("Name  : " + s3.name + ", ");
        System.out.print("age   : " + s3.age + ", ");
        System.out.println("");

        System.out.print("Total Students Having Age Greater Than 8 - ");
        System.out.println(Student.gr8Total);
    }
}
