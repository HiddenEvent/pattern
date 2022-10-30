package type2.singleton;

public class SocketClient {
    private static SocketClient socketClient;

    //기본 생성자 생성 제한 처리 (private)
    private SocketClient() {

    }

    // static 으로 싱글턴 객체 생성
    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");

    }
}
