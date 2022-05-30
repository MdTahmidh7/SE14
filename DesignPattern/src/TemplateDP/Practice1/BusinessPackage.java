package TemplateDP.Practice1;

public class BusinessPackage extends TourPackage{
    @Override
    public void transport() {
        System.out.println("Transport is Plane");
    }

    @Override
    public void accomodation() {
        System.out.println("Hotel is 5 Star");
    }

    @Override
    public void food() {
        System.out.println("Breakfast Lunch and Dinner");
    }
}
