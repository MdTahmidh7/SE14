package PaymentSystem;
public class Main {
    public static void main(String[] args) {
        API bkash = new API();
        Database database = new Database();
        SignIn signIn = new SignIn();
        User user = new User("Saju",121,500);
        User user1 = new User("Raju",122,1000);
        User user2 = new User("kaju",133,200);
        bkash.pay(user);
        bkash.pay(user1);
        bkash.pay(user2);
        System.out.println("---------------The DataBase is -----------");
        database.showDatabase();
        signIn.signIn(user1);
    }
}
