package Structural_DP.Adapter;

public class PenAdapter implements Pen{
    MatadorPen matadorPen = new MatadorPen();
    @Override
    public void write(String str) {
        matadorPen.mark(str);
    }
}
