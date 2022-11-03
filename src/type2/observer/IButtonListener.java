package type2.observer;
// 다른 클래스에 통보(옵저버)를 위한 인터페이스 구현
public interface IButtonListener {
    void clickEvent(String event);
}
