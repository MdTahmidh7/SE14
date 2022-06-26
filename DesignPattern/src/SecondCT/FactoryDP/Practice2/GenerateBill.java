package SecondCT.FactoryDP.Practice2;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Plan p = getPlanFactory.getPlan("com");
        p.getRate(10);
    }
}
