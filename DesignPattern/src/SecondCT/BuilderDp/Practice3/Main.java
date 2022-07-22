package SecondCT.BuilderDp.Practice3;

public class Main {
    public static void main(String[] args) {
        House h = new HouseBuilder().setBasement("base").getHouse();
        System.out.println(h);
    }
}
