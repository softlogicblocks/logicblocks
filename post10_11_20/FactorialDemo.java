package logicblocks.post10_11_20;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of the number " + n + " is: " + fact);
    }

    public static int factorial(int n) {
        int result = n;
        if(n != 1)
            result = result * factorial(n-1);
        return result;
    }
}
