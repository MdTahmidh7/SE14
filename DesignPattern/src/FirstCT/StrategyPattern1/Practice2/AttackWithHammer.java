package FirstCT.StrategyPattern1.Practice2;

public class AttackWithHammer implements AttackEnemy{
    @Override
    public void attack(String s) {
        System.out.println(s+" is attacking with Hammer");
    }
}
