package DP_Presentaion.Problem;

public class User {
    String email;
    public User(String email) {
        this.email = email;
    }
    void userInfo(){
      System.out.println(email);
    }
}
class TestUser {
        public static void main(String[] args) {
            User user = new User("Tahmid");
            user.userInfo();
        }
    }



