package lab1;

public class Ball {
    private String name;
    private int radius;
    public Ball(){
        name = "lab1.Ball";
        radius = 0;
    }
    public Ball(String name){
        this.name = name;
    }
    public Ball(String name, int radius){
        this.name = name;
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getRadius(){
        return radius;
    }
    public String toString() {
        return this.name + ", radius " + this.radius;
    }
}