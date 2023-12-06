package lab1;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("The Atlantean squared his shoulders", 200);
        Book d2 = new Book("Dubrovsky", 220);
        Book d3 = new Book("The Adventures of Captain Nemo"); d3.setPages(340);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
