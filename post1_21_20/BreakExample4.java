package logicblocks.post1_21_20;

public class BreakExample4 {
    public static void main(String args[]) {
        int sum = 0;
        loop1:  for (int j = 10; j >= 1; j--) {
            loop2:      for (int i = 1; i < 10; i++) {
                if (i == 2*j) {
                    System.out.println(i + " : " + j);
                    System.out.print("Done");
                    System.out.println();
                    break;
                }
            }
        }
    }
}
