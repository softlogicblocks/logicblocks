package logicblocks.post6_13_20;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        String s1, s2;
        char ch[];

        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();

        ch = s1.toCharArray();
        s2 = revStr(ch);

        System.out.println();

        System.out.println("String backwards:");
        System.out.println(s2);
    }

    public static String revStr(char[] ch) {
        swapChars(ch, 0, ch.length-1);

        String str = String.valueOf(ch);
        return str;
    }

    public static void swapChars(char[] ch, int left, int right) {
        if(left < right) {
            char tch = ch[left];
            ch[left] = ch[right];
            ch[right] = tch;
            swapChars(ch, left+1, right-1);
        }
    }
}
