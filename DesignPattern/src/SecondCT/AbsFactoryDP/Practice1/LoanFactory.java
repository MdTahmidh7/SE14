package SecondCT.AbsFactoryDP.Practice1;

public class LoanFactory implements AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        if (loanName.equals(null)) return null;
        else if(loanName.equals("home")){
            return new HomeLoan();
        }else {
            return new CarLoan();
        }
    }
}
