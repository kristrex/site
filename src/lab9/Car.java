package lab9;

public class Car implements Nameable{
    String brand;
    int cost;
    public Car(String brand, int cost){
        this.brand = brand;
        this.cost = cost;
    }
    @Override
    public String getName() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
