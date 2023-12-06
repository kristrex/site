package lab4;

public class HumanTest {
    public static void main(String[] args){
        Human h1 = new Human(1, 2, 3, 4);

        System.out.println("Диаметр тела: " + h1.getBody());
        System.out.println("Размер головы: " + h1.getHead());
        System.out.println("Размах рук: " + h1.getHands());
        System.out.println("Размер ноги: " + h1.getLegs());

        h1.setLegs(5);
        System.out.println("Новый размер ноги: " + h1.getLegs());

        Hand hand1 = new Hand(10);
        System.out.println("Количество пальцев: " + hand1.getFingers());
        hand1.setFingers(5);
        System.out.println("Количество пальцев на одной руке: " + hand1.getFingers());

        Head head1 = new Head("brown");
        System.out.println("Цвет волос: " + head1.getHairColor());
        head1.setHairColor("blue");
        System.out.println("Новый цвет волос: " + head1.getHairColor());

        Leg leg1 = new Leg(10);
        System.out.println("Размер ноги: " + leg1.getSize());
        leg1.setSize(11);
        System.out.println("Новый размер ноги: " + leg1.getSize());
    }
}
