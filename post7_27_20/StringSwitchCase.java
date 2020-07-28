package logicblocks.post7_27_20;

import java.util.Scanner;

public class StringSwitchCase {
    public static void main(String args[]) {
        System.out.println("Enter two numbers");
        int i, j, total;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        System.out.println("What do you like to do? Sum / Difference");
        String ans = sc.next();
        switch(ans) {
            case "Sum": total = i + j;
                System.out.println("The answer is: " + total);
                break;
            case "Difference": total = i - j;
                System.out.println("The answer is: " + total);
                break;
            default: total = 0;
                System.out.println("Wrong choice");
        }
    }
}
