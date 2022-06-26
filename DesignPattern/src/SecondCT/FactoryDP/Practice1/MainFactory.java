package SecondCT.FactoryDP.Practice1;

public class MainFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        OS obj = factory.getInstance("w");
        obj.spec();
    }
}
