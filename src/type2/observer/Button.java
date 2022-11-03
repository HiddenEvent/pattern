package type2.observer;

public class Button {
    private String name;
    // 이벤트 발생을 통보해 주기 위한 인터페이스 멤버변수 선언
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    // 이벤트 발생시 처리해야 할 행동 구현을 위한 메서드
    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    // click 이벤트 발생시 옵저버 패턴 발동!
    public void click(String message){
        buttonListener.clickEvent(message);
    }
}
