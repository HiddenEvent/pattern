package type2.aop;

public class AopBrowser implements IBrowser {
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() throws InterruptedException {
        before.run();
        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy 로딩 html from : " + url);
            Thread.sleep(1500);
        }
        after.run();
        System.out.println("BrowserProxy 케싱 from : " + url);

        return html;
    }
}
