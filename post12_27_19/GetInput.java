package logicblocks.post12_27_19;

import java.util.Scanner;

public class GetInput {

    public static void main(String args[]) {
        // Creates an object of Scanner class
        // by calling Constructor method and
        // passed System.in (InputStream class object) as an argument
        Scanner sc = new Scanner(System.in);

        // Asks to user to enter an integer number
        System.out.print("Enter the integer number: ");

        // Prompts for user to enter the number and
        // wait till user press enter button
        // The number is assigned to variable i
        var i = sc.nextInt(); // Or int i = sc.nextInt();

        // Prints the number user entered
        System.out.println("You entered number " + i);
    }
}
