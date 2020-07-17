package logicblocks.post1_18_20;

import java.util.Scanner;

public class EvenOddCond {
    public static void main(String args[]) {
        String strEvenOdd;
        int num;
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        strEvenOdd = ((num % 2) == 0) ? "Even" : "Odd";
        System.out.println(num + " is an " + strEvenOdd + " number.");
    }
}
