package OOPS;
//here you will find bydefault constructor and call by constructor

public class Constructor_class {

    public static class student {
        int age;
        String name;

        student(int age, String name) {
            System.out.println(this.age = age);
            System.out.println(this.name = name);

        }

        public void info() {
            System.out.println(this.age);
            System.out.println(this.name);
            System.out.println("your in copy constructor");
        }

        student(student s2) {
            this.name = s2.name;
            this.age = s2.age;
        }

        student() {
            System.out.println("construction called");
        }
    }

    public static void main(String[] args) {
        // student s = new student(21, "rohan");
        student s = new student();
        s.name = "rohan";
        s.age = 21;

        student s2 = new student(s);
        s2.info();

    }
}
