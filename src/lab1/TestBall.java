package lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Volleyball", 2);
        Ball d2 = new Ball("Football", 7);
        Ball d3 = new Ball("Basketball"); d3.setRadius(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
