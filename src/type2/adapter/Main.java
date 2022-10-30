package type2.adapter;

public class Main {
    public static void main(String[] args) {
        // 110V를 바로 사용 가능
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // adapter패턴 사용 예 1
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        // adapter패턴 사용 예 2
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapterAirconditioner = new SocketAdapter(airConditioner);
        connect(adapterAirconditioner);
    }

    //110V 콘센트 밖에 없다고 가정 -> 220V를 110V로 변환해줘야 하는 상황
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
