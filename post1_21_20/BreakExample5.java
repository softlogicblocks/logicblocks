package logicblocks.post1_21_20;

public class BreakExample5 {
    public static void main(String args[]) {
        int sum = 0;
        for (int j = 10; j >= 1; j--) loop1: {
            loop2:      for (int i = 1; i < 10; i++) {
                if (i == 2*j) {
                    System.out.println(i + " : " + j);
                    System.out.print("Done");
                    System.out.println();
                    break loop1;
                }
            }
        }
    }
}
