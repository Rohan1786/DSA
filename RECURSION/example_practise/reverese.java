package example_practise;

public class reverese {
    public static void Printrev(String str, int i) {
        if (i == 0) {
            System.out.println(str.charAt(0));
            return;
        }
        System.out.println(str.charAt(i));
        Printrev(str, i - 1);
    }

    // without recursion

    public static void main(String[] args) {
        String a = " E F G";
        Printrev(a, a.length() - 1);

        int i;
        for (i = a.length(); i <= 0; i--) {
            System.out.println(i);
        }

    }

}
