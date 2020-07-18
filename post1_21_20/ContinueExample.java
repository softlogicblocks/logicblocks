package logicblocks.post1_21_20;

public class ContinueExample {
    public static void main(String args[]) {
        for(int i = 1; i <= 20; i++) {
            if(9*i < 150) continue;
            System.out.print(9*i + " ");
        }
    }
}
