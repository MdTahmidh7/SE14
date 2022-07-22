package LabExam.Question1;

public class Main {
    public static void main(String[] args) {
        CreateFactory factory = new CreateFactory();
        Charege charege = factory.getCharge("Standard");
        charege.getCharge();


        CreateFactory factory1 = new CreateFactory();
        Charege charege1 = factory.getCharge("Express");
        charege1.getCharge();

    }
}
