package logicblocks.post2_1_20;

public class Average {
    public static void main(String args[]) {
        int nums[] = {11, 3, 7, 8, 20, 16};
        int sum = 0;
        int size = nums.length;

        for(int num: nums) {
            sum = sum + num;
        }

        double avg = sum / size;
        System.out.println("Average is " + avg);
    }
}
