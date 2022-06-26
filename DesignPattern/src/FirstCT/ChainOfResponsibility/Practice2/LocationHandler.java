package FirstCT.ChainOfResponsibility.Practice2;

public class LocationHandler implements ChainHandler{
    private ChainHandler nextChain;
    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(EMail request) {
        if(request.getMailType() == "location"){
            System.out.println("New Location : Mail forward to Business Department");
        }
        else {
            nextChain.handleRequest(request);
        }
    }
}
