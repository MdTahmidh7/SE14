package SecondCT.AbsFactoryDP.Practice1;

public interface AbstractFactory {
    Bank getBank(String bankName);
    Loan getLoan(String loanName);
}
