package logicblocks.post1_18_20;

import java.util.Scanner;

// Divisible by 2 or 5
public class DivBy2Or5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int i = sc.nextInt();
        if((i % 10) == 0) {
            System.out.println("Number " + i + " is divisible by both 2 and 5");
        } else if ((i % 2) == 0) {
            System.out.println("Number " + i + " is divisible by 2 only");
        } else if ((i % 5) == 0) {
            System.out.println("Number " + i + " is divisible by 5 only");
        } else {
            System.out.println("Number " + i + " is not divisible by both 2 and 5");
        }
    }
}
