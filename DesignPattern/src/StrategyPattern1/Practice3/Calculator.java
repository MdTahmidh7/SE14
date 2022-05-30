package StrategyPattern1.Practice3;

public class Calculator {
Strategy strategy;
public Calculator(Strategy strategy){
    this.strategy = strategy;
}
public void calculate(int a, int b){
    strategy.doOperation(a,b);
}
}
