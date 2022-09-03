package FirstCT.TemplateDP.Practice1;
public class Main {
    public static void main(String[] args) {
        TourPackage economyPackage = new EconomyPackage();
        System.out.println("------Economy Package------");
        economyPackage.travel();
        TourPackage businessPackage = new BusinessPackage();
        System.out.println("------Business Package------");
        businessPackage.travel();
    }
}
