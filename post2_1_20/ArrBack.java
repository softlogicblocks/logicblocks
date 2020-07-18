package logicblocks.post2_1_20;

public class ArrBack {
    public static void main(String args[]) {
        double nums[] = {11.5, 3.2, 9.1, 11.80, 20.23, 70.76};

        for(int i = (nums.length-1); i >= 0; i--) {
            System.out.println("nums[" + i + "]: " + nums[i]);
        }
    }
}
