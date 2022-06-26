package SecondCT.FactoryDP.Practice2;

public class GetPlanFactory {
    public Plan getPlan(String plan){
        if(plan.equals("dom")) return new DomesticPlan();
        else return new ComercialPlan();
    }
}
