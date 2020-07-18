package logicblocks.post1_21_20;

public class BreakContinue {
    public static void main(String args[]) {
        int sum = 0;
        loop1:  for (int j = 10; j >= 1; j--) {
            loop2:      for (int i = 1; i < 10; i++) {
                if (i == 2*j) {
                    System.out.println(i + " : " + j);
                    System.out.print("Continue");
                    System.out.println();
                    continue;
                }
                if (i == 4*j) {
                    System.out.println(i + " : " + j);
                    System.out.print("Break");
                    System.out.println();
                    break loop1;
                }
            }
        }
    }
}
