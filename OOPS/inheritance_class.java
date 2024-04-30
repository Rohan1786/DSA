package OOPS;

// here you will get different types of inheritance

// 1->single level   2->multilevel inheritance
// 3->Hybrid inheritance 4->multiple inheritance (it is based interface of the class)
class shape {
    String shape;
    int area;

    shape() {
        System.out.println(this.shape);
        System.out.println(this.area);
    }

    public void display() {
        System.out.println(this.shape);
        System.out.println(this.area);
    }

}

class triangle extends shape {

}

public class inheritance_class {
    public static class Animal {
        String name = "elephant";
    }

    public static class elephant extends Animal {
        int age = 21;
    }

    public static void main(String[] args) {
        Animal n = new Animal();
        elephant ne = new elephant();
        System.out.println(n.name + " name of the animal\n\n\n*********");

        System.out.println("it is totally based on inheritance class of elephant from animal class\n" + ne.name
                + "  name of the animal\n" + ne.age + "  it is the age of the animal");

        shape s = new shape();

        triangle t1 = new triangle();
        t1.area = 21;
        t1.shape = "triangle";
        t1.display();

    }

}
