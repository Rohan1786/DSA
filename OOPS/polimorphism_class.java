package OOPS;

import java.util.Scanner;

//overloading function can be there in polimormosim
public class polimorphism_class {

    public static String display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter variable for display");
        String a = sc.next();
        System.out.println("************welcome to the polimorphism function************");
        return a;
    }

    public static int display(int a) {

        return a;

    }

    public static int display(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        System.out.println(display());

        System.out.println(display(21));
        System.out.println(display(21, 56));

    }
}
