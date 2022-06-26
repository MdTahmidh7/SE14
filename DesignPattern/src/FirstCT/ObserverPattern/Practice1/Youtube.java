package FirstCT.ObserverPattern.Practice1;

public class Youtube {
    public static void main(String[] args) {
        Chanel bdAround = new Chanel();
        Subscriber s1 = new Subscriber("Salman");
        Subscriber s2 = new Subscriber("SRK");
        Subscriber s3 = new Subscriber("Amir");
        Subscriber s4 = new Subscriber("Nawaz");
        bdAround.subscribe(s1);
        bdAround.subscribe(s3);
        bdAround.subscribe(s4);
        System.out.println("\n--------bdAround--------\n");
        bdAround.uploadVideo("My Country BD");
        bdAround.unSubscribe(s1);
        bdAround.subscribe(s2);
        System.out.println("\n---------bdAround-------\n");
        bdAround.uploadVideo("Beauty of BD");
        /*+++++++++++++++++++++++++++++++++++++++++++++++++*/
        /*System.out.println("\n---------ftPrince-------\n");
        Chanel ftPrince = new Chanel();
        ftPrince.subscribe(s1);
        ftPrince.subscribe(s4);
        ftPrince.uploadVideo("My 1st video");*/


    }
}
