package logicblocks.post1_20_20;

// While Example
public class WhileExample1 {
    public static void main(String args[]) {
        int i = 1, sum = 0;
        while(i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
