package OOPS;

class pen {
    String color;

    public void Coloring() {
        System.out.println(this.color);
    }
}

public class Class {
    String name;
    int age;

    public static void main(String[] args) {
        Class newClass = new Class();

        System.out.println(newClass.name + " name of the student");
        System.out.println(newClass.age + " age of the student");
        pen pen1 = new pen();
        pen1.color = "orange";
        pen1.Coloring();

    }

}
