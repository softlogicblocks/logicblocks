package logicblocks.post1_18_20;

import java.util.Scanner;

public class SwitchOper {
        public static void main(String args[]) throws java.io.IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two numbers: ");
            double val1 = sc.nextDouble();
            double val2 = sc.nextDouble();
            double finalVal = 0;

            System.out.println("Choose the operator '+', '-', '*', '/', '%': ");
            char oper = (char) System.in.read();
            switch(oper) {
                case '+':
                    finalVal = val1 + val2;
                    break;
                case '-':
                    finalVal = val1 - val2;
                    break;
                case '*':
                    finalVal = val1 * val2;
                    break;
                case '/':
                    finalVal = val1 / val2;
                    break;
                case '%':
                    finalVal = val1 % val2;
                    break;
                default:
                    finalVal = 0;
                    System.out.println("Default");
            }
            System.out.println("Final Value is " + finalVal);
        }

    }
