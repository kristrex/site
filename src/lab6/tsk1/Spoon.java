package lab6.tsk1;

public class Spoon extends Dish{
    double length;

    public Spoon(String material, String color, double length){
        super(material, color);
        this.length = length;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void use(){
        System.out.println("It is used as a cutlery");
    }
}
