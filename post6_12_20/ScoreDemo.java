package logicblocks.post6_12_20;

public class ScoreDemo {
    public static void main(String args[]) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        Score s1 = new Score(0);
        Score s2 = new Score(0);

        System.out.println("Initial Score: ");
        System.out.println("Player1 " + s1.getScore());
        System.out.println("Player2 " + s2.getScore());

        for(int i = 0; i < 15; i++) {
            int dice1 = (int)(Math.random() * range) + min;
            int dice2 = (int)(Math.random() * range) + min;
            if(dice1 > dice2) Score.setScore(s1);
            else Score.setScore(s2);
        }

        System.out.println();
        System.out.println("Final Score: ");
        System.out.println("Player1 " + s1.getScore());
        System.out.println("Player2 " + s2.getScore());

    }
}
