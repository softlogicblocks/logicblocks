package logicblocks.post4_26_21;

public interface IUserName {
    // String MSG;
    String MSGLEN = "User name should have atleast 8 characters!!";
    String MSGNUM = "User name should have atleast one numeric character!!";
    String MSGDOLLAR = "User name should not have dollar sign!!";

    public void getUsername();

    public void displayUsername();

    public static boolean isValid(String name) {
        boolean isValid = true;
        // MSGLEN = "User should have ateast 10 characters!!";
        if(name.length() < 8) {
            System.out.println(MSGLEN);
            isValid = false;
            return isValid;
        }
        if(!name.matches(".*\\d.*")) {
            System.out.println(MSGNUM);
            isValid = false;
            return isValid;
        }
        if(name.matches(".*[$].*")) {
            System.out.println(MSGDOLLAR);
            isValid = false;
            return isValid;
        }
        return isValid;
    }
}
