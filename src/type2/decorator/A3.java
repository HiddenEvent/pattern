package type2.decorator;
// 데코레이터 클래스를 상속받는다
public class A3 extends AudiDecorator{
    public A3(ICar audi) {
        super(audi, "A3", 1000);
    }
}
