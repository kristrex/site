package lab9;

public class SodaPrice implements Priceable{
    String name;
    int cost;
    public SodaPrice(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }
}
