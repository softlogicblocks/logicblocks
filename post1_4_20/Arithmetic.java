package logicblocks.post1_4_20;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]) {
        //Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Asks to user to enter two integer numbers
        System.out.print("Enter two integer numbers: ");

        // Prompts user to enter first integer number
        int operand1 = sc.nextInt();

        // Prompts user to enter second integer number
        int operand2 = sc.nextInt();

        // Calculates sum by adding first number and second number
        int sum = operand1 + operand2;

        // Calculates difference by subtracting second number
        // from first number
        int difference = operand1 - operand2;

        // Calculates product by multiplying first number and second number
        int product = operand1 * operand2;

        // Calculates quotient by dividing first number by second number
        int quotient = operand1 / operand2;

        // Calculates remainder by dividing first number
        // by second number using remainder operator
        int remainder = operand1 % operand2;

        // Prints the sum
        System.out.println("Sum: " + sum);

        // Prints the difference
        System.out.println("Difference: " + difference);

        // Prints the product
        System.out.println("Product: " + product);

        // Prints the quotient
        System.out.println("Quotient: " + quotient);

        // Prints the remainder
        System.out.println("Remainder: " + remainder);
    }
}
