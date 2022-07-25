package Structural_DP.Composite;
public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf("hd", 2500);
        Component mouse = new Leaf("mouse", 500);
        Component monitor = new Leaf("monitor", 5000);
        Component ram = new Leaf("ram", 3200);
        Component cpu = new Leaf("cpu", 10500);

        Composite cabinet = new Composite("cabinet");
        Composite peripheral = new Composite("peripheral");
        Composite mb = new Composite("mb");
        Composite computer = new Composite("computer");

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);
        mb.addComponent(ram);
        mb.addComponent(cpu);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        computer.showPrice();


    }
}