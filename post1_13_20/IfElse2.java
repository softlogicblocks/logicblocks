package logicblocks.post1_13_20;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int q = i / 2;
        if((i % 2) == 0) {
            System.out.println("Number is even");
            System.out.println("Half of the value is " + q);
        }
        else {
            System.out.println("Number is odd");
            System.out.println("Half of the value will be a double value");
        }
    }
}
