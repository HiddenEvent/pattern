package type2.aop;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();


        IBrowser iBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        iBrowser.show();
        System.out.println("로딩 시간 : "+end.get());

        iBrowser.show();
        System.out.println("로딩 시간 : "+end.get());
    }
}
