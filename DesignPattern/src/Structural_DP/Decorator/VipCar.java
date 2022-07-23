package Structural_DP.Decorator;

public class VipCar extends Decorator{
    public VipCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Vip Car");
    }
}
