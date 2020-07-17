package logicblocks.post1_17_20;

// Skipping statemnets in for loop
public class ForExample4 {
    public static void main(String args[]) {
        int i = 1, sum = 0;
        for( ; i <= 10; ) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
