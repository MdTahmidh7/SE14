package SecondCT.FactoryDP.Practice2;

public class DomesticPlan implements Plan{

    @Override
    public void getRate(int unite) {
        System.out.println("Cost is = "+(unite*3.5));
    }
}
