package lab9;

public class CarPrice implements Priceable{
    String brand;
    int cost;
    public CarPrice(String brand, int cost){
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public int getPrice() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
