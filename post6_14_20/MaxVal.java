package logicblocks.post6_14_20;

public class MaxVal {
    public static void main(String args[]) {
        int a = max(10, 20, 30);
        int b = max(25, 35, 37, 28, 25);
        int c = max(1, 12, 33, 23, 45, 19, 34, 64, 28);

        System.out.println("Max Values are : a = " + a + ", b = " + b + ", c = " + c);
    }

    public static int max(int ... num) {
        int m = num[0];
        for(int i = 1; i < num.length; i++) {
            if(num[i] > m) m = num[i];
        }
        return m;
    }
}
