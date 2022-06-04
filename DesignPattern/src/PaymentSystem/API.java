package PaymentSystem;

public class API /*extends Database*/{
    String tid;
    public int randomNumber(){
        int number = (int) Math.round(Math.random()*10);
        return number;
    }
    public void pay(User user){
        System.out.println("API = "+user.name+" pay amount = "+user.amount);
        Database.users.add(user);
       // Database.nameList.add(user.name);
        tid = randomNumber()+"ABC";
        user.setTid(tid);
        System.out.println(user.name+" your Transaction Id is = "+tid);
    }

}
