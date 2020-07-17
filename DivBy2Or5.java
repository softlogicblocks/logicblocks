package logicblocks.Exercises;

/* Write a program which asks user to enter the number and checks if number is divisible by 2 and 5.
* Print appropriately for four conditions -
* If number is divisible by only 2
* if number is divisible by only 5
* If number is divisible by both 2 and 5
* if number is not divisible by any of them */
import java.util.Scanner;

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
