package lab4;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.3, 2.6, 1.3 * 1.3 * 3.14);
        System.out.println("Диаметр окружности: " + c1.getDiameter());
        System.out.println("Радиус окружности: " + c1.getRadius());
        System.out.println("Площадь окружности: " + c1.getSquare());
        c1.setDiameter(3.6);
        c1.setRadius(1.8);
        c1.setSquare(1.8*1.8*3.14);
        System.out.println("Диаметр окружности: " + c1.getDiameter());
        System.out.println("Радиус окружности: " + c1.getRadius());
        System.out.println("Площадь окружности: " + c1.getSquare());
    }
}
