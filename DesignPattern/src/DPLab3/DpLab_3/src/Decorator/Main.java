package Decorator;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BasicCarPackage basicCar = new BasicCarPackage();
        System.out.println("__________________");
        basicCar.bookCar();

        FamilyCarPackage passengerCar = new FamilyCarPackage(basicCar);

        System.out.println("\n\n__________________");
        passengerCar.bookCar();

        VIPCarPackage vipCar = new VIPCarPackage(basicCar);
        System.out.println("\n\n__________________");
        vipCar.bookCar();

        VIPCarPackage vipCar1 = new VIPCarPackage(passengerCar);
        System.out.println("\n\n__________________");
        vipCar1.bookCar();
    }
}