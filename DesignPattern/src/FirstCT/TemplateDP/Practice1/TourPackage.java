package FirstCT.TemplateDP.Practice1;

public abstract class TourPackage {
    public final void travel(){
        transport();
        accomodation();
        food();
    }
    public abstract void transport();
    public abstract void accomodation();
    public abstract void food();
}
