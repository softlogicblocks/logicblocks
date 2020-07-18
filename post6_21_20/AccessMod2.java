package logicblocks.post6_21_20;

public class AccessMod2 {
    private int num = 10;

    public void printNum() {
        System.out.println("Calling from the class itself: " + num);
        showMsg();
    }

    public void changeNum() {
        num = num + 5;
    }

    private void showMsg() {
        if(num > 12) System.out.println("Number > 12");
    }
}
