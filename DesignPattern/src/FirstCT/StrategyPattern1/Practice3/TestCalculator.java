package FirstCT.StrategyPattern1.Practice3;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Add());
        calculator.calculate(10,20);
        calculator = new Calculator(new Sub());
        calculator.calculate(100,12);
        calculator = new Calculator(new Mul());
        calculator.calculate(12,10);
        calculator = new Calculator(new Div());
        calculator.calculate(100,10);

    }
}
