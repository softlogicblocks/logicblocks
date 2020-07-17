package logicblocks.post1_1_20;

import java.util.Scanner;

public class Divide {
    public static void main(String args[]) {
        //Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Asks to user to enter two integer numbers
        System.out.print("Enter the dividend and divisor number: ");

        // Prompts user to enter dividend integer number
        int dividend = sc.nextInt();

        // Prompts user to enter divisor integer number
        int divisor = sc.nextInt();

        // Calculates quotient by dividing dividend by divisor
        int quotient = dividend / divisor;

        // Calculates remainder by dividing dividend
        // by divisor using remainder operator
        int remainder = dividend % divisor;

        // Prints the quotient
        System.out.println("Quotient: " + quotient);

        // Prints the remainder
        System.out.println("Remainder: " + remainder);
    }
}
