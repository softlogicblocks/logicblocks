package logicblocks.post6_28_20;

public class Test {
    public static void main (String args[]) {
        char ch = 'A';
        System.out.println("Character is " + ch); // 'A'

        ch++; // increment by 1
        System.out.println("Character is " + ch); // 'B'

        ch+=5; // increment by 5
        System.out.println("Character is " + ch); // 'G'

        ch--;
        System.out.println("Character is " + ch); // 'F'

        ch-=3;
        System.out.println("Character is " + ch); // 'C'

        // ch = ch + 10; doesn't convert implicitly, needs explicit type conversion

        // Explicit Type Conversion
        ch = (char)(ch + 10);
        System.out.println("Character is " + ch); // 'M'

        ch = (char)(ch - 5);
        System.out.println("Character is " + ch); // 'H'

        ch = 75;
        System.out.println("Character is " + ch); // 'K'

        ch = 225;
        System.out.println("Character is " + ch); // 'á'
    }
}
