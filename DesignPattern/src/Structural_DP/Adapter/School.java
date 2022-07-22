package Structural_DP.Adapter;
public class School {
    public static void main(String[] args) {
//    PenAdapter penAdapter = new PenAdapter();
        Pen matador = new PenAdapter();
        Assignment assignment = new Assignment();
//    assignment.setPen(penAdapter);
        assignment.setPen(matador);
        assignment.writeAssignment("This is a line");
    }
}
