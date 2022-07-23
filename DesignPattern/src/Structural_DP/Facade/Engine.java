package Structural_DP.Facade;

public class Engine {
   private AirFlowController airFlowController;
    private   FuelInjector fuelInjector;
    private CoolingController coolingController;
    public Engine(){
        airFlowController = new AirFlowController();
        fuelInjector = new FuelInjector();
        coolingController = new CoolingController();
    }
    public void engineStart(){
        airFlowController.takeAir();
        fuelInjector.start();
        fuelInjector.inject();
        coolingController.start();
        coolingController.cool();
    }
    public void stopEngine(){
        airFlowController.airOff();
        fuelInjector.stop();
        coolingController.stop();
    }
}
