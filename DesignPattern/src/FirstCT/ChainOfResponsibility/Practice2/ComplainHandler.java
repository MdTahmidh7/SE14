package FirstCT.ChainOfResponsibility.Practice2;

public class ComplainHandler implements ChainHandler{
    private ChainHandler nextChain;
    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(EMail request) {
        if(request.getMailType() == "complain"){
            System.out.println("Complain : Forward to legal department");
        }
        else {
            nextChain.handleRequest(request);
        }
    }
}
