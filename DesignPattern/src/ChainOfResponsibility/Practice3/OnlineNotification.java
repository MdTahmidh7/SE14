package ChainOfResponsibility.Practice3;

public class OnlineNotification implements Chain{
    Chain nextChain;
    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handelRequest(Notification notification) {
        if(notification.getNotification()=="OnlineNotification"){
            System.out.println("It is a OnlineNotification");
        }
        else {
            System.out.println("Give a valid notification");
        }
    }
}
