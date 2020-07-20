package logicblocks.post7_14_20;

import java.io.IOException;
import java.util.Scanner;

public class Sentence {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        int wordCount = words.length;
        System.out.println("Word Count is " + wordCount);
    }
}
