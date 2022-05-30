package ChainOfResponsibility.Practice1;

public class Numbers {
    private int number1;
    private int number2;
    private String calType;
    public Numbers(int number1,int number2, String calType){
        this.number1 = number1;
        this.number2 = number2;
        this.calType = calType;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }
    public String getCalType() {
        return calType;
    }
}
