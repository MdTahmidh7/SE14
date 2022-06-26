package FirstCT.ChainOfResponsibility.Practice2;

public class GeneralHandler implements ChainHandler{
    private ChainHandler nextChain;
    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(EMail request) {
        if(request.getMailType() == "general"){
            System.out.println("General Mail : Handel");
        }
        else {
           // System.out.println("Can not detect Mail type");
            nextChain.handleRequest(request);
        }
    }
}
