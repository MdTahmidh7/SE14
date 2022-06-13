package PrototypeDP.Practice1;

import java.util.ArrayList;

public class Item implements CloneShop{
    String itemName;
  //  int numberOfItem;
  //  int weight;

    public Item(String itemName) {
        this.itemName = itemName;
      //  this.numberOfItem = numberOfItem;
      //  this.weight = weight;
    }

    //    public Item(String itemName,int numberOfItem,int weight){
//
//    }
    @Override
    public Item clonee() {
        return new Item(this.itemName);
    }
}
