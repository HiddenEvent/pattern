package type1.ex03;
// 예전에 만들어진 레거시 코드라고 가정
// OuterTiger 코드를 수정하면 OCP원칙위배 => 어답터를 생성해야한다.
public class OuterTiger {
    private String fullName = "호랑이";

    public String getFullName() {
        return fullName;

    }
}
