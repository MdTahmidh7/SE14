package PrototypeDP.Practice1;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop("121",1,2);
        shop1.setCategory(Shop.Category.Grocery);
        shop1.setColor(Shop.Color.Blue);
        shop1.add("Potato");
        shop1.add("Carrot");
        Shop shop2 = shop1.clone();

        shop2.setCategory(Shop.Category.Grocery);
        shop2.setColor(Shop.Color.Red);

        System.out.println(shop1+ " \n "+shop2);
        System.out.println();
        System.out.println(shop1.items+ " \n "+shop2.items);
    }
}
