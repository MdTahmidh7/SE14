package SecondCT.AbsFactoryDP.Practice1;

public class Main {
    public static void main(String[] args) {
//        CreateFactory createFactory = new CreateFactory();
//        AbstractFactory abstractFactory = createFactory.geFactoryType("bank");
//        Bank b = abstractFactory.getBank("Sonali");
//        b.getBankDetails();
//        abstractFactory = createFactory.geFactoryType("loan");
//        Loan loan = abstractFactory.getLoan("home");
//        loan = abstractFactory.getLoan("home");
//        loan.getLoanDetails();
        CreateFactory create = new CreateFactory();
        AbstractFactory abstractFactory = create.geFactoryType("loan");
        Loan l = abstractFactory.getLoan("home");
        l.getLoanDetails();
    }
}
