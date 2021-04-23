package logicblocks.post4_23_21;

public class Even implements Group {
    int lastEven = 0;
    int groupSize = 0;
    int evenList[];

    Even(int n) {
        groupSize = n;
        evenList = createGroup(n);
    }

    public int getNextNo() {
        lastEven = lastEven + 2;
        return lastEven;
    }

    public int[] getList() {
        return evenList;
    }

    public String getName() {
        return "Even Numbers List: ";
    }
}
