package logicblocks.post8_6_20;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Mystery number should be between 2 and 12");
        System.out.println("Guess the mystery number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        rollDice(number);
    }

    static void rollDice(int number) {
        int tempNumber1;
        tempNumber1 = 9;
        //tempNumber1 = tempNumber1 + 3;
        int tempNumber2 = tempNumber1 + 3;

        class Dice {
            int rand = 0;
            int totDice = 0;
            int mysteryNumber = 0;
            int range = 6;

            // Dice constructor
            Dice() {
                totDice++;
            }

            // Gets Random Number, if 0 then again gets the random number
            void getRandomNumber() {
                do {
                    rand = (int) (range * Math.random());
                } while(rand == 0);
            }

            // Adds Dice number to another Dice number
            void addDice(Dice d) {
                mysteryNumber = rand + d.rand;
            }

            // Gets Random Value
            int getRandValue() {
                return rand;
            }

            // Checks if Mystery number equals to guessed number
            void checkMysteryNumber() {
                if(number >= 2 && number <= 12) {
                    int closeDiff = mysteryNumber - number;
                    if (mysteryNumber == number) {
                        System.out.println("Correct!!");
                    } else if ((closeDiff <= 3) && (closeDiff >= -3)) {
                        System.out.println("Close Enough!!");
                    } else if ((closeDiff > 3) || (closeDiff < -3)) {
                        System.out.println("Good try but not so close!!");
                    }
                    System.out.println("Mystery number is : " + mysteryNumber);
                } else {
                    System.out.println("Wrong number!!");
                }

            }

            void finalData() {
                // Variables and parameters can be accessed but can't be changed
                // tempNumber1++;
                // number++;
                System.out.println("Temporary Number 1 : - " + tempNumber1);
                System.out.println("Parameter number - " + number);
            }
        }

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        d1.getRandomNumber();
        d2.getRandomNumber();
        d1.addDice(d2);
        d1.checkMysteryNumber();

        // Variables and parameters can't be changed in method itself -
        // they are effectively final as they are accessed in the local class
        // tempNumber1++;
        // number++;
        System.out.println("");
        System.out.println("Final Data Accessed in class");
        d1.finalData();
        // tempNumber2 is not final as it is not accessed by the local class
        tempNumber2 = tempNumber2 + 5;
        System.out.println("Data Not Accessed in class, so it's not final");
        System.out.println("Temporary Number 2 - " + tempNumber2);
    }
}
