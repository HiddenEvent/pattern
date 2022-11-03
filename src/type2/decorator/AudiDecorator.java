package type2.decorator;

// 데코레이터 클래스 또한 의존성 역전을 위해 ICar를 상속받는다.
public class AudiDecorator implements ICar{
    // 기본뼈대를 건드리지 않기 위해 인터페이스를 멤버변수로 할당
    protected ICar audi;
    // 기본 뼈대 외에 추가될 데이터 정의 (modelName, modelPrice)
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName+"의 가격은 "+getPrice()+" 원 입니다.");
    }
}
