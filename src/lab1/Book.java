package lab1;

public class Book {
    private String name;
    private int pages;
    public Book(){
        name = "lab1.Book";
        pages = 0;
    }
    public Book(String name){
        this.name = name;
    }
    public Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getPages(){
        return pages;
    }
    public String toString() {
        return this.name + ", pages " + this.pages;
    }
}