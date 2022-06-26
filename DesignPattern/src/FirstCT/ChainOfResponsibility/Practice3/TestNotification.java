package FirstCT.ChainOfResponsibility.Practice3;

public class TestNotification {
    public static void main(String[] args) {
        Chain chain = new SMS();
        Chain chain1 = new Email();
        Chain chain2 = new OnlineNotification();

        chain.nextChain(chain1);
        chain1.nextChain(chain2);

        Notification notification = new Notification("Sms");
        chain.handelRequest(notification);




    }
}
