package lab6.tsk2;

public class TestDog {
    public static void main(String[] args) {
        Husky h1 = new Husky("Husky", 5);
        System.out.println("Breed dog is " + h1.getBreed());
        h1.givePaw();
        Pomerain p1 = new Pomerain("Husky", 5);
        System.out.println("Breed dog is " + p1.getBreed());
        p1.givePaw();
    }
}
