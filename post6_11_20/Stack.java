package logicblocks.post6_11_20;

public class Stack {
    private char ch[];
    private int size, lastIndex;

    Stack(int size) {
        this.size = size;
        ch = new char[size];
        lastIndex = 0;
    }

    void push(char c) {
        if(lastIndex == size) {
            System.out.println("Stack is full");
            return;
        }

        ch[lastIndex] = c;
        System.out.print(c + " ");
        lastIndex++;
    }

    void pop() {
        if(lastIndex == 0) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print(ch[lastIndex-1] + " ");
        lastIndex--;
    }
}
