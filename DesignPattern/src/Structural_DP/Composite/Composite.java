package Structural_DP.Composite;
import java.util.ArrayList;
import java.util.List;
public class Composite implements Component {
    String name;
    public Composite(String name) {
        this.name = name;
    }
    List<Component> components = new ArrayList<>();
    public void addComponent(Component component) {
        components.add(component);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component : components) {
            component.showPrice();
        }
    }
}
