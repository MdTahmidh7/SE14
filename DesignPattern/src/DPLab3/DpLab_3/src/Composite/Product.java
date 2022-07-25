package Composite;

import java.util.ArrayList;
import java.util.List;

public class Product implements Component {
    String name;
    public  Product(String name){
        this.name = name;
    }
    List<Component> componentList = new ArrayList<>();
    public void add(Component component){
        componentList.add(component);
    }
    @Override
    public void showPrice() {
        System.out.println("Product : "+name);
        for (Component components:
             componentList) {
            components.showPrice();
        }
    }
}
