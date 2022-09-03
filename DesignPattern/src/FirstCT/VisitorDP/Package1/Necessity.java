package FirstCT.VisitorDP.Package1;

public class Necessity implements Visitable {
    private double price;

    public Necessity(double price) {
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
