package Structural_DP.Bridge;

public class Bus extends AutoMobile {
    public Bus(WorkShop produceWorkShop, WorkShop assembleWorkShop) {
        super( produceWorkShop,assembleWorkShop);
    }
    @Override
    public void manufacture() {
        System.out.print("Bus is ");
        produceWorkShop.work();
        assembleWorkShop.work();
    }
}
