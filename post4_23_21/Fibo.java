package logicblocks.post4_23_21;

public class Fibo implements Group {
    int lastFibo1 = 0;
    int lastFibo2 = 0;
    int groupSize = 0;
    int FiboList[];

    Fibo(int n) {
        groupSize = n;
        FiboList = createGroup(n);
    }

    public int getNextNo() {
        if(lastFibo1 >= 1 && lastFibo2 >= 1) {
            int temp = lastFibo2;
            lastFibo2 = lastFibo2 + lastFibo1;
            lastFibo1 = temp;
        } else if (lastFibo2 == 0) lastFibo2 = 1;
        else if (lastFibo2 == 1) {
            lastFibo1 = 1;
        }
        return lastFibo2;
    }

    public int[] getList() {
        return FiboList;
    }

    public String getName() {
        return "Fibonacci Numbers List: ";
    }
}
