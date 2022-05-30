package ChainOfResponsibility.Practice3;

public class Email implements Chain{
    Chain nextChain;
    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handelRequest(Notification notification) {
        if(notification.getNotification()=="Email"){
            System.out.println("It is a Email");
        }
        else {
            nextChain.handelRequest(notification);
        }
    }
}
