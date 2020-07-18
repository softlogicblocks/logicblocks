package logicblocks.post1_25_20;

import java.util.Scanner;

public class WhileSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want sum till");
        int number = sc.nextInt();
        int i = 1, sum = 0;
        while(i <= number) {
            sum += i;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
