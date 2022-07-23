package Structural_DP.Facade;

public class FacadeTest {
    public static void main(String[] args) {
        Engine engine = new Engine();
        System.out.println("\n\nStarting Procedure");
        engine.engineStart();


        System.out.println("\n\nStopping Procedure");
        engine.stopEngine();

    }
}
