package Structural_DP.Proxy;

public class Browser {
    public static void main(String[] args) {
        WebProxy webProxy = new WebProxy();
        try {
            webProxy.renderPage("www.youtube.com");
        }catch (Exception e){
            System.out.println("Exception occur "+e.getMessage());
            e.printStackTrace();
        }
    }
}
