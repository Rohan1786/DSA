package example_practise;

import java.util.Scanner;

public class variable {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the pasword");
        String lognumber = sc.next();

        if (lognumber == "Rohan123") {
            System.out.println("your enter correct password" + lognumber);
        } else {
            System.out.println("enter correct password");
        }

    }
}
