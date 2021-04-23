package logicblocks.post4_23_21;

public class GroupDemo {
    public static void main(String args[]) {
        Group g1 = new Prime(10);
        Group.displayGroup(g1);
        Group g2 = new Fibo(10);
        Group g3 = new Odd(10);
        Group.displayGroup(g2);
        Group.displayGroup(g3);
        Group g4 = new Even(10);
        Group.displayGroup(g4);
    }
}
