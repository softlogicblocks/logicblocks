package logicblocks.post1_15_20;

import java.io.IOException;

public class SwitchCase {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter your grading ('A','B','C','D')");
        char grading = (char) System.in.read();
        switch(grading) {
            case 'A':
                System.out.println("You have A grading.");
                System.out.println("Your marks are between 75% and 100%.");
                break;
            case 'B':
                System.out.println("You have B grading.");
                System.out.println("Your marks are between 50% and 75%.");
                break;
            case 'C':
                System.out.println("You have C grading.");
                System.out.println("Your marks are between 25% and 50%.");
                break;
            case 'D':
                System.out.println("You have D grading.");
                System.out.println("Your marks are between 0% and 25%.");
                break;
            default: System.out.println("Wrong grading!!");
        }
    }
}
