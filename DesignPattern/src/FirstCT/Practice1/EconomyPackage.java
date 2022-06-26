package FirstCT.Practice1;

public class EconomyPackage extends TourPackage{
    @Override
    public void transport() {
        System.out.println("Transport is Bus");
    }

    @Override
    public void accomodation() {
        System.out.println("Hotel is 3 Star");
    }

    @Override
    public void food() {
        System.out.println("Only lunch and dinner");
    }
}
