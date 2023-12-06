package lab3;

public class TestAuthor {
    public static void main(String[] argc){
        Author d1 = new Author("Alexei", "11@mail.ru", 'M');
        Author d2 = new Author("Anna", "Annateach@mail.ru", 'F');
        Author d3 = new Author("Ekaterina", "KatyaBest@gmail.com", 'F');
        System.out.println(d1);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
    }
}
