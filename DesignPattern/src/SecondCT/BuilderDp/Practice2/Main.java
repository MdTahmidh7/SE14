package SecondCT.BuilderDp.Practice2;

public class Main {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setName("Android").setRam(8).getPhone();
        System.out.println(p);
    }
}
