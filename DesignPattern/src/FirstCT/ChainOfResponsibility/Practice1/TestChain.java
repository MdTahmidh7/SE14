package FirstCT.ChainOfResponsibility.Practice1;

public class TestChain {
    public static void main(String[] args) {
        Chain cal1 = new AddNumber();
        Chain cal2 = new SubstracNUmber();
        Chain cal3 = new MulNumber();
        Chain cal4 = new DivNumber();

        cal1.setNextChain(cal2);
        cal2.setNextChain(cal3);
        cal3.setNextChain(cal4);
        cal4.setNextChain(cal1);

        Numbers request = new Numbers(10,2,"mul");
        cal1.calculate(request);


    }
}
