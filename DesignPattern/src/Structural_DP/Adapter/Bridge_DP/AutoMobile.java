package Structural_DP.Adapter.Bridge_DP;

public abstract class AutoMobile {
    WorkShop assembleWorkShop;
    WorkShop produceWorkShop;
    public AutoMobile(WorkShop produceWorkShop,WorkShop assembleWorkShop){
        this.assembleWorkShop = assembleWorkShop;
        this.produceWorkShop = produceWorkShop;
    }
    public abstract void manufacture();


}
