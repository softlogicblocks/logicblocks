package logicblocks.post1_28_20;

public class StudentTest {
    public static void main(String args[]) {
        Student s1 = new Student("John", 6);
        System.out.println("Student1 -");
        System.out.print("Name  : " + s1.name + ", ");
        System.out.print("age   : " + s1.age + ", ");
        System.out.println("Total : " + s1.total);
        System.out.println("");
        Student s2 = new Student("Adam", 9);
        Student s3 = new Student("Alex", 7);

        System.out.println("Student1 -");
        System.out.print("Name  : " + s1.name + ", ");
        System.out.print("age   : " + s1.age + ", ");
        System.out.println("Total : " + s1.total);
        System.out.println("");

        System.out.println("Student2 -");
        System.out.print("Name  : " + s2.name + ", ");
        System.out.print("age   : " + s2.age + ", ");
        System.out.println("Total : " + s2.total);
        System.out.println("");

        System.out.println("Student3 -");
        System.out.print("Name  : " + s3.name + ", ");
        System.out.print("age   : " + s3.age + ", ");
        System.out.println("Total : " + s3.total);
        System.out.println("");

        System.out.println("Student Total -");
        System.out.println(Student.total);
    }
}
