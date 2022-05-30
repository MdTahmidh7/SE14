package StrategyPattern1.Practice1;

public class PlayAnimal {
    public static void main(String[] args) {

        Animal tiger = new Dog();
        String s = tiger.tryToFly();
        System.out.println("Tiger "+s);
        Animal mithu = new Bird();
        String s1 = mithu.tryToFly();
        System.out.println("Mithu "+s1);
        tiger.setFlying(new ItFlys());
        s = tiger.tryToFly();
        System.out.println("Tiger "+s);
    }
}
