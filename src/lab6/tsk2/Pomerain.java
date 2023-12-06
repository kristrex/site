package lab6.tsk2;

public class Pomerain extends Dog{
    public Pomerain(String breed, int age){
        super(breed, age);
    }

    @Override
    public void givePaw() {
        System.out.println("Pomerain gives a paw");
    }
}