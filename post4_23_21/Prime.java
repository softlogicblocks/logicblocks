package logicblocks.post4_23_21;

public class Prime implements Group {
    int lastPrime = 1;
    int groupSize = 0;
    int primeList[];

    Prime(int n) {
        groupSize = n;
        primeList = createGroup(n);
    }

    public int getNextNo() {
        if(lastPrime >= 3) {
            boolean foundNext = false;
            int temp = lastPrime;
            while(!foundNext) {
                temp = temp + 2;
                if(isPrime(temp)) {
                    lastPrime = temp;
                    foundNext = true;
                }
            }
        } else if (lastPrime == 1) lastPrime = 2;
        else if (lastPrime == 2) lastPrime = 3;
        return lastPrime;
    }

    public int[] getList() {
        return primeList;
    }

    public String getName() {
        return "Prime Numbers List: ";
    }

    public boolean isPrime(int n) {
        boolean prime = true;
        for(int j = 3; j < n; j = j + 2) {
            if((n % j) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
