package FirstCT.VisitorDP.Package1;

public class Liquid implements Visitable{
    private double price;

    public Liquid(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);

    }
}
