package logicblocks.post1_21_20;

public class BreakExample1 {
    public static void main(String args[]) {
        int sum = 0;
        for(int i = 1; i < 20; i++) {
            sum = sum + i;
            if(sum >= 100) break;
            System.out.print(i + " ");
        }
    }
}
