package logicblocks.post7_27_20;

public class StringClassDemo {
    public static void main(String args[]) {
        char ch[] = {'S', 't', 'r', 'i', 'n', 'g', ' ', 'D', 'e', 'm', 'o'};
        int in[] = {83, 116, 114, 105, 110, 103, 32, 68, 101, 109, 111};

        String s = "Logic Blocks";
        // String Class Constructors
        String s1 = new String(ch);
        String s2 = new String("String Demo");
        String s3 = new String(ch, 0, ch.length);
        String s4 =  new String(in,0,in.length);
        String str = "String Demo";
        String s5 = new String(str);

        System.out.println("s1: " + s1 + ", s2: " + s2 + ", s3: " + s3 + ", s4: " + s4 + ", s5: " + s5 + "\n");

        // String Class Methods
        // length()
        System.out.println("String s1 has length of " + s1.length() + " characters!!\n");

        // isEmpty()
        System.out.println("String s2 is empty :" + s2.isEmpty() + "\n");

        // charAt()
        System.out.println("String s3 has character at index 8 is " + s3.charAt(8) + "\n");

        // codePointAt(), codePointBefore() and codePointCount()
        System.out.println("String s4 has Unicode Code Point at index 8 is " + s4.codePointAt(8) + "\n");
        System.out.println("String s5 has Unicode Code Point at index before 8 is " + s5.codePointBefore( 8) + "\n");
        System.out.println("String s1 has code point count " + s1.codePointCount(0, 5) + "\n");

        // equals() and equalsIgnoreCase()
        System.out.println("String s2 is equal to s3 " + s2.equals(s3) + "\n");

        s5 = "String demo";
        System.out.println("String s4 is equal to s5 " + s4.equals(s5) + "\n");
        System.out.println("String s4 is equal (Ignore Case) to s5 " + s4.equalsIgnoreCase(s5) + "\n");

        // compareTo() and compareToIgnoreCase()
        System.out.println("String s1 is compared to s5 " + s1.compareTo(s5) + "\n");
        System.out.println("String s1 is compared (Ignore Case) to s5 " + s1.compareToIgnoreCase(s5) + "\n");

        // startsWith() and endsWith()
        System.out.println("String s2 starts with 'Str' " + s2.startsWith("Str") + "\n");
        System.out.println("String s2 starts with 'ring' at index 1 " + s2.startsWith("ring", 1) + "\n");
        System.out.println("String s2 starts with 'ring' at index 2 " + s2.startsWith("ring", 2) + "\n");
        System.out.println("String s5 ends with 'mo' " + s5.endsWith("mo") + "\n");

        // indexOf() and lastIndexOf()
        String s6 = "Logic Blocks";
        System.out.println("Index of character 'o' in String s6 is " + s6.indexOf('o') + "\n");
        System.out.println("Last index of character 'o' in String s6 is " + s6.lastIndexOf('o') + "\n");

        // substring()
        System.out.println("Substring starting at index 2 in String s6 is " + s6.substring(2) + "\n");
        System.out.println("Substring starting at between index 2 and 5 in String s6 is " + s6.substring(2, 5) + "\n");

        // concat()
        System.out.println("'Soft' is concatenated to String s6 " + "Soft ".concat(s6) + "\n");

        // replace()
        System.out.println("String s6 character 'B' is replaced by 'b' " + s6.replace('B','b') + "\n");

        // split
        String sp[]  = s6.split(" ");
        System.out.print("String s6 is split with space: ");
        for(int i = 0; i < sp.length; i++) {
            System.out.print("(" + (i+1) + ")" + sp[i] + " ");
        }
        System.out.println();

        // toLowerCase() and toUpperCase()
        System.out.println("String s6 is converted into lowercase " + s6.toLowerCase() + "\n");
        System.out.println("String s6 is converted into uppercase " + s6.toUpperCase() + "\n");

        // trim
        String s7 = " Logic Blocks       ";
        System.out.println("String s7 before trim : " + s7 + "...\n");
        System.out.println("All leading and trailing spaces are trimmed in String s7 : " + s7.trim() + "...\n");

        // toCharArray() and valueOf()
        char ca[]  = s6.toCharArray();
        System.out.print("String s6 is converted into char array: ");
        for(int i = 0; i < ca.length; i++) {
            System.out.print(ca[i] + " ");
        }
        System.out.println();
        System.out.println("Character Array ca has value as " + String.valueOf(ca) + "\n");

        // repeat()
        System.out.println("String s6 is repeated 3 times " + s6.repeat(3) + "\n");
    }
}
