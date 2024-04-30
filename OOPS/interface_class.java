package OOPS;

//while interfacing the class its can n=be multiple inheritance
interface Animal1 {
    void walk();

}

interface Herbiorus1 {
    void eat();
}

class Horse1 implements Animal1, Herbiorus1 {
    public void walk() {
        System.out.println("walk on 4 legs");

    }

    public void eat() {
        System.out.println("horse can eat");
    }
}

public class interface_class {
    public static void main(String[] args) {
        Horse1 h = new Horse1();
        h.walk();
        h.eat();

    }
}
