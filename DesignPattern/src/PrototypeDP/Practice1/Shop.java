package PrototypeDP.Practice1;

import java.util.ArrayList;

public class Shop implements CloneShop{
   // ArrayList<Item> arrayList = new ArrayList<Item>();
    public ArrayList<String> items;
    public void add(String s){
        if (items == null){
            items = new ArrayList<>();
        }
        items.add(s);
    }
    Category category;
    Color color;

    @Override
    public Object clonee() {
        return new Shop(this.ID,this.number,this.floor);

    }

    enum Category{
        Toy,
        Grocery,
        Jewellery,
        Clothing
    }
   enum Color{
        Blue,
        Green,
        Black,
        Red
    }
    int floor;
    int number;
    String ID;

    public Shop( String ID,int number,int floor) {
        this.floor = floor;
        this.number = number;
        this.ID = ID;
        //this.items = s;

    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return
                "\tcategory=" + category +
                ",\tcolor=" + color +
                ",\tfloor=" + floor +
                ",\tnumber=" + number +
                ",\tID='" + ID +
                "\tItem = "+items;
    }
    public Shop clone(){
        Shop shop = new Shop(this.ID,this.number,this.floor);
        shop.items = this.items;
//        for (String item:items
//        ) {
//            shop.items.add(item);
//        }
        return shop;
    }
}
