package logicblocks.post2_19_20;

public class CreateHeartPattern {
    public static void main(String args[]) {
        int cell1 = 5, cell2 = 6, cell3 = 14, cell4 = 15, val = 5;
        for (int i = 1; i <= 15; i++) {
            if(i <= 5) {
                for (int j = 1; j <= 19; j++) {
                    if(j < cell1) System.out.print("  ");
                    if(j > cell2 && j < cell3) System.out.print("  ");
                    if(j == cell1 || j == cell2 || j == cell3 || j == cell4) System.out.print(val + " ");
                    if(j > cell1 && j < cell2) System.out.print("  ");
                    if(j > cell3 && j < cell4) System.out.print("  ");
                }
                cell1--; cell2++; cell3--; cell4++;
                val--;
            } else if(i >=6 && i <=10){
                cell1++;cell4--;val++;
                for (int j = 1; j <= 19; j++) {
                    if(j < cell1) System.out.print("  ");
                    if(j == cell1 || j == cell4) System.out.print(val + " ");
                    if(j > cell1 && j < cell4) System.out.print("  ");
                }
            }
            else if(i >=11 && i <=15){
                cell1++;cell4--;
                for (int j = 1; j <= 19; j++) {
                    if(j < cell1) System.out.print("  ");
                    if(j == cell1 || j == cell4) System.out.print(val + " ");
                    if(j > cell1 && j < cell4) System.out.print("  ");
                }
                val--;
            }
            System.out.println("");
        }
    }
}
