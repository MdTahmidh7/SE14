package PaymentSystem;

public class User {
    String name;
    int id;
    int amount;
    String tid;

    public User(String name, int id, int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }
    public void showInfo(){
        System.out.println("Name = "+name+" Amount = "+amount+" Id = "+id+" Tid = "+tid
        );
    }
    public void setTid(String tid){
        this.tid = tid;
    }
}
