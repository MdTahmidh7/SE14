package ChainOfResponsibility.Practice1;

public class DivNumber implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalType() == "div"){
            System.out.println(request.getNumber1()+" / "+ request.getNumber2()+" = "
                    +(request.getNumber1() / request.getNumber2()));
        }else{
            System.out.println("Only works for : 'add', 'sub', 'mul', 'div'");
        }
    }
}
