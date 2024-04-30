package OOPS;

abstract class Animal {
    public void walk() {
        System.out.println("animal can walk");
    }

    abstract void speak();

    Animal() {
        System.out.println("created animal");
    }
}

class horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }

    public void speak() {
        System.out.println("horse can't speak");
    }

    horse() {
        System.out.println("horsehas been created");
    }
}

public class abstract_class {
    public static void main(String[] args) {

        horse horse1 = new horse();
        horse1.walk();
        horse1.speak();
    }

}
