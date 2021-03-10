package logicblocks.post3_9_21;

import java.util.Scanner;

public class MultiplyBinaryNumbers {
    public static void main(String args[]) {
        System.out.println("Enter two binary values");
        Scanner sc = new Scanner(System.in);
        Long binary1 = sc.nextLong();
        Long binary2 = sc.nextLong();

        int decVal1 = binaryToDecimal(binary1);
        int decVal2 = binaryToDecimal(binary2);

        System.out.println("Binary number 1 => " + binary1 + " : " + decVal1);
        System.out.println("Binary number 2 => " + binary2 + " : " + decVal2);

        System.out.println(Long.MAX_VALUE);

        multiplyBinaryNumbers(binary1, binary2);
    }

    // Converts Binary Number To Decimal Number
    public static int binaryToDecimal(Long binaryVal) {
        int decVal = 0;
        int rem, pow = 0;

        while(binaryVal != 0) {
            rem = (int)(binaryVal % 10);
            decVal = decVal + rem * calcPower(2, pow);
            binaryVal = binaryVal / 10;
            pow++;
        }
        return decVal;
    }

    // Calculate to the power
    public static int calcPower(int no1, int no2) {
        int powVal = 1;
        for(int i = 0; i < no2; i++) {
            powVal = powVal * no1;
        }
        return powVal;
    }

    // Adds Two Binary Numbers
    public static Long addBinaryNumbers(Long binary1, Long binary2) {
        Long binaryVal = 0L;

        int sum = 0;
        int rem1, rem2, remainder = 0, i = 0, pow = 0;

        // Addition is done bit by bit
        while(binary1 != 0 || binary2 != 0) {
            // rem1 is next bit of binary1 and rem2 is next bit of binary2
            rem1 = (int)(binary1 % 10);
            rem2 = (int)(binary2 % 10);

            // remaining bits of binary numbers
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;

            // sum of the bits + carryover if any
            sum = (rem1 + rem2 + remainder) % 2;  // remainder is carry over
            remainder = (rem1 + rem2 + remainder) / 2;
            binaryVal = binaryVal + sum * calcPower(10, pow);
            pow++;
        }
        if(remainder != 0) {
            // If last bit addition has carryover, add it too
            binaryVal = binaryVal + calcPower(10, pow);
        }

        int totVal = binaryToDecimal(binaryVal);

        return binaryVal;
    }

    // Multiplies Two Binary Numbers
    public static Long multiplyBinaryNumbers(Long binary1, Long binary2) {
        Long binaryVal = 0L;

        int rem;

        int pos = 1;
        Long tempBinaryVal = 0L;

        // Multiplication is done bit by bit by binary2
        while(binary2 != 0) {
            rem = (int)(binary2 % 10);
            tempBinaryVal = binary1 * rem;
            for(int i = 1; i < pos; i++)
                tempBinaryVal = tempBinaryVal * 10;

            binaryVal = addBinaryNumbers(binaryVal, tempBinaryVal);

            pos++;
            binary2 = binary2 / 10;
        }

        int totVal = binaryToDecimal(binaryVal);
        System.out.println();
        System.out.println("Multiplication of two binary numbers => " + binaryVal +  " : " + totVal);
        return binaryVal;
    }
}
