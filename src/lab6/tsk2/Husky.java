package lab6.tsk2;

public class Husky extends Dog{
    public Husky(String breed, int age){
        super(breed, age);
    }

    @Override
    public void givePaw() {
        System.out.println("Husky gives a paw");
    }
}
