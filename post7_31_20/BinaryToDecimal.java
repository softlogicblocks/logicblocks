package logicblocks.post7_31_20;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]) {
        System.out.println("Enter the binary value");
        Scanner sc = new Scanner(System.in);
        Long binaryVal = sc.nextLong();

        int decVal = 0;
        int rem, pow = 0;
        Long origBinaryVal = binaryVal;

        while(binaryVal != 0) {
            rem = (int)(binaryVal % 10);
            decVal = decVal + rem * calcPower(2, pow);
            binaryVal = binaryVal / 10;
            pow++;
        }
        System.out.println("Binary Value: " + origBinaryVal);
        System.out.println("Decimal Value: " + decVal);
    }

    // Calculates no1 To The Power no2
    static int calcPower(int no1, int no2) {
        int powVal = 1;
        for(int i = 0; i < no2; i++) {
            powVal = powVal * no1;
        }
        return powVal;
    }
}
