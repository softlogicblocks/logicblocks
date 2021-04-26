package logicblocks.post4_26_21;

import java.util.Scanner;

public class User implements IUserName {
    String userName = "";
    public void getUsername() {
        System.out.println("Enter the user name");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        if(IUserName.isValid(userName)) displayUsername();
    }

    public void displayUsername() {
        System.out.println("User name is " + userName);
    }

    public static void main(String args[]) {
        User user = new User();
        user.getUsername();
        // System.out.println(IUserName.MSGDOLLAR);
        // System.out.println(user.MSGDOLLAR);
    }
 }
