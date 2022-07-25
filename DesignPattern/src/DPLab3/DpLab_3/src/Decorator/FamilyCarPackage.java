package Decorator;

public class FamilyCarPackage extends Decorator{
    public FamilyCarPackage(Car car) {
        super(car);
    }

    @Override
    public void bookCar() {
        super.bookCar();
        System.out.println("Family Car Package");
    }
}
