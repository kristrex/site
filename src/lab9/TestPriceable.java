package lab9;

public class TestPriceable {
    public static void main(String[] args){
        Priceable car1 = new CarPrice("Mercedes", 9000000);
        System.out.println("Brand " + car1.getPrice());

        Priceable soda1 = new SodaPrice("Fanta", 63);
        System.out.println("Fanta price " + soda1.getPrice());
    }
}
