package logicblocks.post1_17_20;

// Multiple statements separated with comma in for loop
public class ForExample2 {
    public static void main(String args[]) {
        int i, j, sum = 0;
        for(i = 1, j = 10; i <= j; i++, j--) {
            sum = sum + i + j;
        }
        System.out.println(sum);
    }
}
