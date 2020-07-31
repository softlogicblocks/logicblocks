package logicblocks.post7_31_20;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        System.out.println("Enter the decimal value");
        Scanner sc = new Scanner(System.in);
        int decVal = sc.nextInt();

        Long binaryVal = 0L;
        int rem, pow = 0;
        int origDecVal = decVal;

        while(decVal != 0) {
            rem = (int)(decVal % 2);
            decVal = decVal / 2;
            binaryVal = binaryVal + rem * calcPower(10, pow);
            pow++;
        }

        System.out.println("Decimal Value: " + origDecVal);
        System.out.println("Binary Value: " + binaryVal);
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
