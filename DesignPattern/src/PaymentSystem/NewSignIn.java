package PaymentSystem;

import java.util.Scanner;

public class NewSignIn extends Database{
    String tid;
    String name;
    Scanner s = new Scanner(System.in);
    public void signIn(){
        System.out.println("Enter name = ");
        name = s.next();
        System.out.println("Enter Tid = ");
        tid = s.next();
        checkSignIn(name,tid);
    }
}
