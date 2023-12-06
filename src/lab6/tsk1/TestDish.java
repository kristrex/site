package lab6.tsk1;

public class TestDish {
    public static void main(String[] args){
        Cup c1 = new Cup("porcelain", "white", 0.5);
        System.out.println("Material " + c1.getMaterial() + ", size " + c1.getSize() + ", color " + c1.getColor());
        c1.setColor("Red");
        System.out.println("Material " + c1.getMaterial() + ", size " + c1.getSize() + ", new color " + c1.getColor());

        Spoon s1 = new Spoon("metal", "white", 5);
        System.out.println("Material " + s1.getMaterial() + ", length " + s1.getLength() + ", color " + s1.getColor());
        c1.setColor("Blue");
        System.out.println("Material " + s1.getMaterial() + ", size " + s1.getLength() + ", new color " + s1.getColor());
    }
}
