package PaymentSystem;

import java.util.Scanner;

public class API{
    String tid;
    public int randomNumber(){
        int number = (int) Math.round(Math.random()*10);
        return number;
    }
    public void pay(User user){
        int amount;
        boolean isValidUser=false;
        String mobileNumber;
        int pinNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mobile number : ");
        mobileNumber=scanner.next();
        //Business logic
        //if user is valid then user will give paying amount
        System.out.println("Enter your amount : ");
        amount=scanner.nextInt();
        //business logic
        //if amount is less than his/her account balance...
        System.out.println("Enter PIN : ");
        pinNumber=scanner.nextInt();
        user.setAmount(amount);
        //business logic
        // if pinNumber is correct
        Database.users.add(user);
        tid = randomNumber()+"ABC";
        user.setTid(tid);
        System.out.println("msg = "+user.name+",payment TK."+user.amount+" to NSTU PGDIT is successful.");
        System.out.println("your Transaction Id is = "+tid);
    }

}
