package logicblocks.post1_14_20;

import java.util.Scanner;

public class StringInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line:");
        String line = sc.nextLine();
        System.out.println("Line is " + line);

        System.out.println("Enter the word:");
        String word = sc.next();
        System.out.println("Word is " + word);
    }
}
