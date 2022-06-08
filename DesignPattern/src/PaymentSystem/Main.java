package PaymentSystem;
public class Main {
    public static void main(String[] args) {
        API bkash = new API();
        Database database = new Database();
        SignIn signIn = new SignIn();
        NewSignIn newSignIn = new NewSignIn();
        User user = new User("Saju",121);
        User user1 = new User("Raju",122);
        User user2 = new User("Kaju",133);
        User user3 = new User("Haju",134);
        bkash.pay(user);
        bkash.pay(user1);
        //bkash.pay(user2);
        System.out.println("---------------The DataBase is -----------");
        database.showDatabase();// signIn.signIn(user1);
        newSignIn.signIn();
       //  newSignIn.signIn();
       //  newSignIn.signIn();
       //  newSignIn.signIn();


    }
}
