package logicblocks.post1_13_20;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();

        if(i <= 2) System.out.println(i + " <= 2");
        else if(i <= 5) System.out.println(i + " > 2 and " + i + " <= 5");
        else if(i <= 10) System.out.println(i + " > 5 and " + i + " <= 10");
        else if(i <= 20) System.out.println(i + " > 10 and " + i + " <= 20");
        else System.out.println(i + " > 20");
    }
}
