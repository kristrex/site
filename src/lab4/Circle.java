package lab4;

public class Circle {
    double radius;
    double diameter;
    double square;
    public Circle(double radius, double diameter, double square){
        this.diameter = diameter;
        this.radius = radius;
        this.square = square;
    }
    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
