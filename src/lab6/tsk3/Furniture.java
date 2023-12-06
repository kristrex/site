package lab6.tsk3;

public abstract class Furniture {
    String color;
    int height;
    public Furniture(String color, int height){
        this.color = color;
        this.height = height;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public abstract void move();
    public abstract void check();
}
