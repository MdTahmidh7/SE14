package Structural_DP.Proxy;

public class WebProxy implements WebPage{
    WebPage webPage;

    public WebProxy() {
        this.webPage = new WebPageImp();
    }

    @Override
    public void renderPage(String url) throws Exception {
        if (url.equalsIgnoreCase("www.youtube.com")){
            throw new Exception(url + " is blocked by ISP");
        }else {
            webPage.renderPage(url);
        }
    }
}
