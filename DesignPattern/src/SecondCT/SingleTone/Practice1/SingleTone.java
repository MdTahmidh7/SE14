package SecondCT.SingleTone.Practice1;

public class SingleTone {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC abc = ABC.getObj();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC abc1 = ABC.getObj();
            }
        });
        thread.start();
        thread1.start();
//        ABC abc2 = ABC.getObj();
//        ABC abc3 = ABC.getObj();
    }

}
class ABC{
    public static ABC obj;
    private ABC(){
        System.out.println("Object Created");
    }
    public static ABC getObj(){
        if (obj==null){
            synchronized (ABC.class){
                if (obj==null){
                    obj = new ABC();
               }
            }
        }
        return obj;
    }
}
