package logicblocks.post1_17_20;

// program to add the numbers 1 to 10 with for loop
public class ForExample1 {
    public static void main(String args[]) {
        int i, sum = 0;
        for(i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
