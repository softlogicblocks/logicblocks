package logicblocks.post7_14_20;

import java.util.Scanner;

public class CaseChange {
    public static void main(String args[]) {
        String s1, s2;
        char ch[];

        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();

        // Convert the string to character array
        ch = s1.toCharArray();
        s2 = changeCase(ch);

        System.out.println();

        System.out.println("String Case Changed:");
        System.out.println(s2);
    }

    public static String changeCase(char[] ch) {
        // Manipulate all the characters in array
        for(int i = 0; i < ch.length; i++) {
            if((ch[i] >= 65) && (ch[i] <= 90)) {
                // If the character is A~Z
                ch[i] = (char)(ch[i] + 32);
            }
            else if((ch[i] >= 97) && (ch[i] <= 122))
            {
                // If the character is a~z
                ch[i] = (char)(ch[i] - 32);
            }
        }

        // Convert character array back to the string
        String str = String.valueOf(ch);
        return str;
    }
}
