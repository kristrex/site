package lab6.tsk3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }
    public void showFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.check();
        }
    }
    public static void main(String[] args) {
        FurnitureShop shp = new FurnitureShop();
        Chair c1 = new Chair("Red", 5);
        System.out.println("Color this furniture is " + c1.getColor());
        c1.move();
        Table t1 = new Table("Blue", 3);
        System.out.println("Color this furniture is " + t1.getColor());
        t1.move();
        shp.addFurniture(c1);
        shp.addFurniture(t1);
        shp.showFurniture();
    }
}
