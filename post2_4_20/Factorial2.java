package logicblocks.post2_4_20;

public class Factorial2 {
    public static void main(String args[]) {
        int val = 5;
        int fact = 1 ;
        for(int i = 5; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of 5 is: " + fact);
    }
}
