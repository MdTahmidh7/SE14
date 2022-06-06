package PaymentSystem;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> users = new ArrayList<>();
    public void showDatabase(){
        for (User u:users) {
            System.out.println("Name = "+u.name+" Id = "+u.id+" Amount = "+u.amount+" Tid = "+u.tid);
        }
    }
    public void validateUser(User user,String name, String tid){
        if (user.name.equals(name) && user.tid.equals(tid)){
            System.out.println("Sign in successful");
        }
        else{
            System.out.println(" Error ");
        }
    }
    public void checkSignIn(String name,String tid){
        boolean validUser = false;
        for (User u:users) {
            // break;
            validUser = u.name.equals(name) && u.tid.equals(tid);
            if (validUser){
                break;
            }
        }
        if (validUser){
            System.out.println("---------->Access Granted");
        }else
        {
            System.out.println("----------->Access Denied");
        }
    }

}
