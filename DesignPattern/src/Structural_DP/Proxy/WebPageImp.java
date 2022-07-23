package Structural_DP.Proxy;

public class WebPageImp implements WebPage{
    @Override
    public void renderPage(String url) throws Exception{
        System.out.println(url + " Render Successfully");
    }
}
