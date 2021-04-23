package logicblocks.post4_23_21;

public class Odd implements Group {
    int lastOdd = 1;
    int groupSize = 0;
    int oddList[];

    Odd(int n) {
        groupSize = n;
        oddList = createGroup(n);
    }

    public int getNextNo() {
        lastOdd = lastOdd + 2;
        return lastOdd;
    }

    public int[] getList() {
        return oddList;
    }

    public String getName() {
        return "Odd Numbers List: ";
    }
}
