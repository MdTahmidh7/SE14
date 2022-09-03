package FirstCT.VisitorDP.Package1;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    public double visit(Liquid liquid) {
        System.out.println("Liquid Item Price Tax : ");
        return Double.parseDouble(decimalFormat.format
                ((liquid.getPrice()*.18)+liquid.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item Price Tax : ");
        return Double.parseDouble(decimalFormat.format
                ((tobacco.getPrice()*.32)+tobacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item Price Tax : ");
        return Double.parseDouble(decimalFormat.format
                ((necessity.getPrice()*.0)+necessity.getPrice()));
    }
}
