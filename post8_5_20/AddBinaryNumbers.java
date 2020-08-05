package logicblocks.post8_5_20;

import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String args[]) {
        System.out.println("Enter two binary values");
        Scanner sc = new Scanner(System.in);
        Long binary1 = sc.nextLong();
        Long binary2 = sc.nextLong();

        addBinaryNumbers(binary1, binary2);
    }

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

    public static int calcPower(int no1, int no2) {
        int powVal = 1;
        for(int i = 0; i < no2; i++) {
            powVal = powVal * no1;
        }
        return powVal;
    }

    public static Long addBinaryNumbers(Long binary1, Long binary2) {
        Long binaryVal = 0L;

        int sum = 0;
        int rem1, rem2, remainder = 0, i = 0, pow = 0;

        int decVal1 = binaryToDecimal(binary1);
        int decVal2 = binaryToDecimal(binary2);

        System.out.println("Binary number 1 => " + binary1 + " : " + decVal1);
        System.out.println("Binary number 2 => " + binary2 + " : " + decVal2);

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

        System.out.println("Sum of two binary numbers => " + binaryVal +  " : " + totVal);
        return binaryVal;
    }
}
