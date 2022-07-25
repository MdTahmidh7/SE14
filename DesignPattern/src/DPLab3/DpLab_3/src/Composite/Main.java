package Composite;
public class Main {
    public static void main(String[] args) {

        Component monitor = new Item("monitor", 10000);
        Component mouse = new Item("mouse", 500);
        Component processor = new Item("processor",15000);
        Component ssd = new Item ("ssd",3400);
        Component powerSupplier = new Item("powerSupplier",3500);

        Product peripheral = new Product("Peripheral");
        Product internal = new Product("internal");
        Product computer = new Product("computer");
        Product motherBoard = new Product("motherBoard");

        computer.add(peripheral);
        computer.add(internal);

        internal.add(powerSupplier);
        peripheral.add(monitor);
        peripheral.add(mouse);
        internal.add(motherBoard);
        motherBoard.add(processor);
        motherBoard.add(ssd);

        computer.showPrice();
        System.out.println("\n\n_______________");
        internal.showPrice();
        System.out.println("\n\n_______________");
        motherBoard.showPrice();
        System.out.println("\n\n_______________");
        peripheral.showPrice();

    }
}
