package logicblocks.post10_19_20;

import java.util.Scanner;

public class FibonacciDemo {
    static int[] fibnos;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        fibnos = new int[n+1];
        int fib = fibonacci(n);
        System.out.println(n + "th number in the Fibonacci Sequence (0, 1, 2, ...) is : " + fib);

        for(int i = 0; i < fibnos.length; i++) {
            System.out.print(fibnos[i] + ", ");
        }
    }

    public static int fibonacci(int n) {
        int result = 0;

        if(n == 0) {
            fibnos[0] = 0;
            return 0;
        }
        if(n == 1) {
            fibnos[1] = 1;
            return 1;
        }
        result = fibonacci(n-1) + fibonacci(n-2);
        fibnos[n] = result;
        return result;
    }
}
