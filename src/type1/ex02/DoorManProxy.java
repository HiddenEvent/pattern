package type1.ex02;

public class DoorManProxy extends DoorMan{
    @Override
    public void 쫓아내(Animal a) {
        System.out.println("안녕");
        super.쫓아내(a);
    }
}
