package logicblocks.post1_31_20;

public class ArrTest {
    public static void main(String args[]) {
        int nums[] = {11, 3, 7, 8, 20, 16};
        int sum = 0;

        for(int num: nums) {
            sum = sum + num;
        }

        System.out.println("Sum is " + sum);
    }
}
