package FirstCT.StrategyPattern1.Practice2;

public class PlayGame {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian();
        barbarian.tryToAttack("Barbarian");
        Hog hog = new Hog();
        hog.tryToAttack("Hog");
        Archer archer = new Archer();
        archer.tryToAttack("Archer");
        hog.setAttackingType(new AttackWithHammer());
        hog.tryToAttack("Hog V2");
    }
}
