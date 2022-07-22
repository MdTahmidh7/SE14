package LabExam.Question1;

public class CreateFactory {
    public Charege getCharge(String string) {
        if(string.equals("Standard")) {
            return new Standard();
        }else if (string.equals("Express")){
            return new Express();
        }else return null;
    }
}
