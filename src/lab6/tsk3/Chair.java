package lab6.tsk3;

public class Chair extends Furniture {
    public Chair(String color, int height){
        super(color, height);
    }

    @Override
    public void move() {
        System.out.println("Chair was moved");
    }
    public void check() {
        System.out.println("Chair color " + this.color + ", height " + this.height);
    }
}
