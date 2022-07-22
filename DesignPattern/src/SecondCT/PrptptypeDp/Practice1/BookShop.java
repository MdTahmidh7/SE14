package SecondCT.PrptptypeDp.Practice1;
import java.util.ArrayList;
import java.util.List;

public class BookShop implements IClone{
    String bookShopName;
    List<Book> bookList = new ArrayList<Book>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
    void loadData(){
        for (int i = 0; i <10 ; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Name"+i);
            getBookList().add(book);
        }
    }
    @Override
    public BookShop cloneee() {
        BookShop bookShop = new BookShop();
        for (Book book : getBookList()) {
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
