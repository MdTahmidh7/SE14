package FirstCT.ObserverPattern.Practice1;


public class Subscriber implements ISubscriber {
    private String name;
   // private Chanel chanel = new Chanel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " : New Video Uploaded " + '"' + videoTitle + '"');
    }


}
