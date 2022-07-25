package Composite;

public class Item implements Component {
    String name;
    int price;
    public Item (String name, int prince){
        this.name = name;
        this.price = prince;
    }
    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
