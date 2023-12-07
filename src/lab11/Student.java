package lab11;

public class Student {
    public String name;
    public int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String toString(){
        return "\nID: " + this.number + " Name: " + this.name;
    }
}
