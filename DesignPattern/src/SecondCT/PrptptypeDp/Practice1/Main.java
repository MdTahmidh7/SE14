package SecondCT.PrptptypeDp.Practice1;

public class Main {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.setBookShopName("Bangla Book ");
        bookShop.loadData();
        System.out.println(bookShop);

        System.out.println("\n");

        BookShop bookShop1 = bookShop.cloneee();
        bookShop1.getBookList().remove(1);
        System.out.println(bookShop);
        System.out.println(bookShop1);

    }
}
