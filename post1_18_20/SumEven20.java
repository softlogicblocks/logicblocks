package logicblocks.post1_18_20;

public class SumEven20 {
    public static void main(String args[]) {
        int i, sum = 0;
        for(i = 0; i <= 20; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers between 0 and 20 is " + sum);
    }
}
