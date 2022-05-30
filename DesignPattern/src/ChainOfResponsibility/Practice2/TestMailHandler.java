package ChainOfResponsibility.Practice2;

public class TestMailHandler {
    public static void main(String[] args) {
        ChainHandler handler1 = new SpamHandler();
        ChainHandler handler2 = new FanHandler();
        ChainHandler handler3 = new LocationHandler();
        ChainHandler handler4 = new ComplainHandler();
        ChainHandler handler5 = new GeneralHandler();

        handler1.setNextChain(handler2);
        handler2.setNextChain(handler3);
        handler3.setNextChain(handler4);
        handler4.setNextChain(handler5);
        handler5.setNextChain(handler1);

        EMail request = new EMail("spa");
        handler4.handleRequest(request);

    }
}
