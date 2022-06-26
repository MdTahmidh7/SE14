package PrptptypeDp;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books = new ArrayList<Book>();

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
            getBooks().add(book);
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
