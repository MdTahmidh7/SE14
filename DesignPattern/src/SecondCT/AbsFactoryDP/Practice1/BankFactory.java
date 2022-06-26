package SecondCT.AbsFactoryDP.Practice1;

public class BankFactory implements AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        if (bankName.equals(null)) return null;
        else if(bankName.equals("Sonali")){
            return new SonaliBank();
        }else {
            return new NationalBank();
        }
    }

    @Override
    public Loan getLoan(String loanName) {
        return null;
    }
}
