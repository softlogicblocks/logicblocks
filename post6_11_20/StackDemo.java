package logicblocks.post6_11_20;

public class StackDemo {
    public static void main(String args[]) {
        Stack s1 = new Stack(10);

        System.out.println("Push to stack:");
        s1.push('j');
        s1.push('a');
        s1.push('v');
        s1.push('a');

        System.out.println("");
        System.out.println("Pop from stack:");

        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();

        System.out.println("");
        System.out.println("Push to stack:");

        s1.push('s');
        s1.push('t');
        s1.push('a');
        s1.push('c');
        s1.push('k');

        System.out.println("");
        System.out.println("Pop from stack:");

        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
    }
}
