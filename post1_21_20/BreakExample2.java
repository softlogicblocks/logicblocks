package logicblocks.post1_21_20;

import java.util.Scanner;

public class BreakExample2 {
    public static void main(String args[]) {
        int i, last = -1;
        System.out.println("Please enter single digit numbers only");
        Scanner sc = new Scanner(System.in);
        do {
            i = sc.nextInt();
            if((i == 0) || (i >= 10)) {
                System.out.println("Stop");
                break;
            }
            last = i;
        } while(true);
        if(last == -1) System.out.println("Last entered number is none");
        else System.out.println("Last entered number is " + last);
    }
}
