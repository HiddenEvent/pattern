package type2.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");

        // 옵저버 패턴 -> 클래스에게 통보할 이벤트 정의
        button.addListener(event -> System.out.println("정의된 이벤트 => "+ event));

        button.click("메세지 전달 : click1");
        button.click("메세지 전달 : click2");
        button.click("메세지 전달 : click3");
        button.click("메세지 전달 : click4");
    }
}
