package PrimitiveObsession.Solution;

public class User {
    Mail email;
    public User(String email) {
        this.email = new Mail(email);
    }
    void userInfo(){
      System.out.println(email);
    }
}
