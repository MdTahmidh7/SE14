package PaymentSystem;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> users = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();

    public void apiToDatabaseConnection(User user){
        System.out.println("Adding user to the database");
        System.out.println("Name = "+user.name);
        users.add(user);
        nameList.add(user.name);
    }
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

}
