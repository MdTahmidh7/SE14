package SecondCT.FactoryDP.Practice2;

public class ComercialPlan implements Plan{
    @Override
    public void getRate(int unite) {
        System.out.println("Cost is = "+(unite*7.5));
    }

}
