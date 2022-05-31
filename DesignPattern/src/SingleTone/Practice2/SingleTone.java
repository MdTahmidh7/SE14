package SingleTone.Practice2;

public class SingleTone {
    public static void main(String[] args) {
        ABC abc = ABC.INSTANCE;
        abc.i = 10;
        abc.show();

        ABC abc1 = ABC.INSTANCE;
        abc.i = 11;
        abc.show();
    }
}
enum ABC{
    INSTANCE;
    int i;
    public void show(){
        System.out.println("I = "+i);
    }
}
