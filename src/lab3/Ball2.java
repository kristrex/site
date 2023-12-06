package lab3;

public class Ball2 {
    private double x;
    private double y;
    public Ball2(){
        x = 0.0;
        y = 0.0;
    }
    public Ball2(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void move(double xMove, double yMove){
        x += xMove;
        y += yMove;
    }
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
