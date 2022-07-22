package SecondCT.PrptptypeDp;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setShopName("BookShop 1");
        shop.lodData();

        BookShop shop1 =  shop.clone();
        shop1.setShopName("BookShop 2");
        shop.getBooks().remove(1);
        System.out.println(shop);
        System.out.println(shop1);
    }
}
