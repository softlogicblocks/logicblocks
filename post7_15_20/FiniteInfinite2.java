package logicblocks.post7_15_20;

public class FiniteInfinite2 {
    public static void main(String args[]) {
        // infinite();
        finite();
    }

    public static void infinite() {
        int i = 0;
        System.out.println("Infinite Loop");
        while(true) {
            i++;
            System.out.print(i + " ");
            if(i%40 == 0) System.out.println("");
        }
    }

    public static void finite() {
        int i = 0;
        System.out.println("Finite Loop");
        while(true) {
            i++;
            System.out.print(i + " ");
            if(i%40 == 0) System.out.println("");
            if(i == 100) break;
        }
        System.out.println("Out of the loop");
    }
}
