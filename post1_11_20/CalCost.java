package logicblocks.post1_11_20;

import java.util.Scanner;

public class CalCost {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);

        double pencilPrice = .10;
        double eraserPrice = .20;
        double sharpenerPrice = .25;
        double notebookPrice = .50;

        System.out.println("How many Pencils?");
        int pencils = sc.nextInt();
        System.out.println("How many Erasers?");
        int erasers = sc.nextInt();
        System.out.println("How many Sharpeners?");
        int sharpeners = sc.nextInt();
        System.out.println("How many Notebooks?");
        int notebooks = sc.nextInt();

        double totCost = 0.0;

        double pencilsCost = pencils * pencilPrice;
        double erasersCost = erasers * eraserPrice;
        double sharpenersCost = sharpeners * sharpenerPrice;
        double notebooksCost = notebooks * notebookPrice;

        totCost = pencilsCost + erasersCost + sharpenersCost + notebooksCost;
        System.out.println("Total Cost is $" + totCost);
    }
}
