package logicblocks.post6_12_20;

public class Score {
    private int val;
    Score(int i) { val = i; }

    static void setScore(Score sc) {
        sc.val++;
    }

    int getScore() {
        return val;
    }
}
