package Structural_DP.Adapter;

public class School {
    public static void main(String[] args) {
    PenAdapter penAdapter = new PenAdapter();
    Assignment assignment = new Assignment();
    assignment.setPen(penAdapter);
    assignment.writeAssignment("This is a line");
    }
}
