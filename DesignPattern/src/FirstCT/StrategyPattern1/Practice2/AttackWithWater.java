package FirstCT.StrategyPattern1.Practice2;

public class AttackWithWater implements AttackEnemy{
    @Override
    public void attack(String s) {
        System.out.println(s+" is attack With Water");
    }
}
