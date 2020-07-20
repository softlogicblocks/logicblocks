package logicblocks.post7_1_20;

public class PrimeNumber {
    public static void main(String args[]) {
        // Find prime numbers between n1 and n2
        int n1 = 2, n2 = 50;

        // Set as the number is prime
        boolean prime = true;
        // Check only odd numbers
        for(int i = 3; i < n2; i = i + 2) { // Outer Loop
            // Divide by only odd numbers and till outer loop number
            for(int j = 3; j < i; j = j + 2) { // Inner Loop
                // If remainder is 0 then number is not prime
                if((i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) System.out.print(i + " ");
            prime = true;
        }
        System.out.println(" ");
    }
}
