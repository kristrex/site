package lab9;

public class Soda implements Nameable{
    String name;
    int cost;
    public Soda(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }
}
