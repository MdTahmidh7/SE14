package Decorator;

public class VIPCarPackage extends Decorator{
    public VIPCarPackage(Car car) {
        super(car);
    }

    @Override
    public void bookCar() {
        super.bookCar();
        System.out.println("VIP Car Package");
    }
}
