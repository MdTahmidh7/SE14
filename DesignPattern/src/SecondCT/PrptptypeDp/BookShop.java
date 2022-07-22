package SecondCT.PrptptypeDp;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    List<Book> books = new ArrayList<Book>();
    private String shopName;
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void lodData() {
        for (int i = 0; i <10 ; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setbName("Book"+i);
            this.books.add(book);
           // getBooks().add(book);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
       BookShop bookShop = new BookShop();
       for (Book book : getBooks()) {
           bookShop.getBooks().add(book);
       }
       return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
