package lab6.tsk1;

public class Cup extends Dish{
    double size;

    public Cup(String material, String color, double size){
        super(material, color);
        this.size = size;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void use(){
        System.out.println("The cup is used to drink something");
    }
}