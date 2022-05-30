package StrategyPattern1.Practice3;

public class Sub implements Strategy{
    @Override
    public void doOperation(int a, int b) {
        System.out.println(a+" - "+b + " = "+ (a-b));
    }
}
