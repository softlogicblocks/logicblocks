package logicblocks.post4_23_21;

public interface Group {
    public int getNextNo();

    public int[] getList();

    public String getName();

    default public int[] createGroup(int n) {
        int num[] = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = getNextNo();
        }
        return num;
    }

    static public void displayGroup(Group g) {
        int num[] = g.getList();
        System.out.println(g.getName());
        int n = num.length;
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
}
