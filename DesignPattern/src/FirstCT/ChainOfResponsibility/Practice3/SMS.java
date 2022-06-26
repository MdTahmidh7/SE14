package FirstCT.ChainOfResponsibility.Practice3;

public class SMS implements Chain{
    Chain nextChain;
    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handelRequest(Notification notification) {
        if(notification.getNotification()=="Sms"){
            System.out.println("It is a SMS");
        }
        else {
            nextChain.handelRequest(notification);
        }
    }
}
