package FirstCT.VisitorDP.Package1;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Necessity milk = new Necessity(40);
        Liquid vodka = new Liquid(100);
        Tobacco cigerate = new Tobacco(20);

        System.out.println(milk.accept(taxVisitor));
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigerate.accept(taxVisitor));

    }
}
