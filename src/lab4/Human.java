package lab4;

public class Human {
    int head;
    int body;
    int hands;
    int legs;
    public Human(int head, int body, int hands, int legs){
        this.body = body;
        this.hands = hands;
        this.head = head;
        this.legs = legs;
    }
    public int getBody() {
        return body;
    }

    public int getHands() {
        return hands;
    }

    public int getHead() {
        return head;
    }

    public int getLegs() {
        return legs;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
