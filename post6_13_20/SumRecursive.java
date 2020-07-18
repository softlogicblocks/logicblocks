package logicblocks.post6_13_20;

public class SumRecursive {
    public static void main(String args[]) {
        int start = 2, end = 8;
        int next = start + 1;
        int total = sum(start, next, end);
        System.out.println("Total is: " + total);
    }

    public static int sum(int total, int next, int end) {
        int tot = total + next;
        if(next != end) {
            next++;
            tot = sum(tot, next, end);
        }
        return tot;
    }
}
