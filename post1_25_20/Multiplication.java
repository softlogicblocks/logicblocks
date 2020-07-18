package logicblocks.post1_25_20;

import java.util.Scanner;

public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table");
        int num = sc.nextInt();
        int mul = 0;
        for(int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(num + "  *  " + i + "  =  " + mul);
        }
    }
}
