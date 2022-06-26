package FirstCT.ChainOfResponsibility.Practice2;

public class FanHandler implements ChainHandler{
    private ChainHandler nextChain;
    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(EMail request) {
        if(request.getMailType() == "fan"){
            System.out.println("Fan Mail : Forward to CEO");
        }
        else {
            nextChain.handleRequest(request);
        }
    }

}
