package PaymentSystem;

import java.util.Scanner;

public class SignIn extends Database{

    String tid;
    String name;
    Scanner s = new Scanner(System.in);
    public void signIn(User user){
        System.out.println("Enter name = ");
        name = s.next();
        System.out.println("Enter Tid = ");
        tid = s.next();
        validateUser(user,this.name,this.tid);
    }
}
