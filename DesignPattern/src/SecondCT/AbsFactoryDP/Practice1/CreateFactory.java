package SecondCT.AbsFactoryDP.Practice1;

public class CreateFactory {
    AbstractFactory geFactoryType(String type){
        if(type.equals("bank")) return new BankFactory();
        else if (type.equals("loan")) return new LoanFactory();
        else return null;
    }
}
