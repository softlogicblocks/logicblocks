package logicblocks.post2_4_20;

public class Factorial1 {
    public static void main(String args[]) {
        int val = 5;
        int fact = 1 ;
        for(int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of 5 is: " + fact);
    }
}
