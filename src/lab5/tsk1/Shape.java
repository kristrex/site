package lab5.tsk1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
    abstract public String toString();
    abstract public double getArea();
    abstract public double getPerimeter();
}
