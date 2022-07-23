package Structural_DP.Decorator;

public class Person {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
        basicCar.design();
        System.out.println("_________________");
        PassengerCar passengerCar = new PassengerCar(basicCar);
        passengerCar.design();
        System.out.println("_________________");
        VipCar vipCar = new VipCar(passengerCar);
        vipCar.design();

        System.out.println("\n\n");
        VipCar vipCar1 = new VipCar(basicCar);
        vipCar1.design();
        System.out.println("_________________");
        PassengerCar passengerCar1 = new PassengerCar(vipCar1);
        passengerCar1.design();
    }
}
