package lab9;

public class TestNameable {
    public static void main(String[] args){
        Nameable car1 = new Car("Mercedes", 9000000);
        System.out.println("Brand " + car1.getName());

        Nameable soda1 = new Soda("Sprite", 9000000);
        System.out.println("Soda " + soda1.getName());
    }
}
