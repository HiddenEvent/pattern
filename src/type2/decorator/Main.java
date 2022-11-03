package type2.decorator;

public class Main {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        // A3
        ICar audi3 = new A3(audi);
        audi3.showPrice();

        // A4
        ICar audi4 = new A4(audi);
        audi4.showPrice();

        // A5
        ICar audi5 = new A5(audi);
        audi5.showPrice();
    }
}
