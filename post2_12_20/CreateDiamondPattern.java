package logicblocks.post2_12_20;

public class CreateDiamondPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            if(i <= 5) {
                for (int j = i; j < 5; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = i; j > 5; j--) {
                    System.out.print("  ");
                }
                for (int j = (10-i); j >=1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= (10-i); j++) {
                    System.out.print(j + " ");
                }

            }
            System.out.println("");
        }
    }
}
