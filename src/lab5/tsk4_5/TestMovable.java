package lab5.tsk4_5;

public class TestMovable {
    public static void main(String[] args){
    MovableCircle mc = new MovableCircle(1, 0, 3, 2, 5);
    System.out.println(mc.toString());

    MovableRectangle mr = new MovableRectangle(0, 0, 3, 3, 2, 2);
    System.out.println(mr.toString());

    MovablePoint mp = new MovablePoint(1, 2, 2, 2);
    System.out.println(mp.toString());
    }
}
