package lab5.tsk4_5;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "x: " + this.x + ", y: " + this.y + ", xSpeed:" + this.xSpeed + ", ySpeed:" + this.ySpeed + ", radius: " + this.radius;
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
}
