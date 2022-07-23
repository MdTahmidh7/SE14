package Structural_DP.Bridge;

public class Taxi extends AutoMobile {
    public Taxi(WorkShop produceWorkShop, WorkShop assembleWorkShop) {
        super(produceWorkShop,assembleWorkShop);
    }
    @Override
    public void manufacture() {
        System.out.println("Taxi is ");
        produceWorkShop.work();
        assembleWorkShop.work();
    }
}
