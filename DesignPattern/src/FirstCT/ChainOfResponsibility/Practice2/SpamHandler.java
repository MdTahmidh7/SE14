package FirstCT.ChainOfResponsibility.Practice2;

public class SpamHandler implements ChainHandler{
    int count=0;
    private ChainHandler nextChain;
    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(EMail request) {
        if(count!=0){
            System.out.println("Can not detect Mail");
        }
       else if(request.getMailType() == "spam"){
            System.out.println("Spam Defeated");
        }
        else {
            count++;
            nextChain.handleRequest(request);
        }
    }
}
