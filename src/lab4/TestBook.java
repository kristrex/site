package lab4;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Ain Rand", 1131, "The Atlantean squared his shoulders", 1957);

        System.out.println("Автор книги " + b1.getAuthor());
        System.out.println("Количество страниц " + b1.getPages());
        System.out.println("Название книги " + b1.getNameBook());
        System.out.println("Год издания " + b1.getYear());

        b1.setPages(1120);

        System.out.println("Новое количество страниц " + b1.getPages());
    }
}
