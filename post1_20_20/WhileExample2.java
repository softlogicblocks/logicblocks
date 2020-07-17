package logicblocks.post1_20_20;

// do-while loop
public class WhileExample2 {
    public static void main(String args[]) {
        int i = 0, sum = 0;
        do {
            sum = sum + i;
            i++;
        } while(i <= 10);
        System.out.println(sum);
    }
}
