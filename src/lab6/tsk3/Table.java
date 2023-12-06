package lab6.tsk3;

public class Table extends Furniture {
    public Table(String color, int height){
        super(color, height);
    }

    @Override
    public void move() {
        System.out.println("Table was moved");
    }
    public void check() {
        System.out.println("Table color " + this.color + ", height " + this.height);
    }
}