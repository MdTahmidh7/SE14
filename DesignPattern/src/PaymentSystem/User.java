package PaymentSystem;

public class User {
    String name;
    int id;
    int amount;
    String tid;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void showInfo(){
        System.out.println("Name = "+name+" Amount = "+amount+" Id = "+id+" Tid = "+tid
        );
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setTid(String tid){
        this.tid = tid;
    }
}
