package logicblocks.post1_10_20;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        String strEvenOdd;
        int number;
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if((number & 1) == 0)
            strEvenOdd = "Even";
        else
            strEvenOdd = "Odd";
        System.out.println("Number " + number + " is " + strEvenOdd + ".");
    }
}
