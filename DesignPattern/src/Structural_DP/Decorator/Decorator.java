package Structural_DP.Decorator;

public class Decorator implements Car{
    Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public void design() {
        this.car.design();
    }
}
