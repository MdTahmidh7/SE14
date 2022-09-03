package Structural_DP.Adapter;

public class Assignment {
    Pen pen;
    public void setPen(Pen pen) {
        this.pen = pen;
    }
    public void writeAssignment(String str){
        pen.write(str);
    }
}
