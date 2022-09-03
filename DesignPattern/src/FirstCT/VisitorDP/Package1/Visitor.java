package FirstCT.VisitorDP.Package1;

public interface Visitor {
    double visit(Liquid liquid);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
