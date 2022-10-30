package type2.proxy;

public class BrowserProxy implements IBrowser {
    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;

    }

    @Override
    public Html show() {
        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy 로딩 html from : " + url);
        } else {
            System.out.println("BrowserProxy 케싱 from : " + url);
        }
        return html;
    }
}
