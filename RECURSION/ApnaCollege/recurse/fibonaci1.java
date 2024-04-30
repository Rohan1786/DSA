package ApnaCollege.recurse;

public class fibonaci1 {

    public static void PrintFibonaci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        // a is referce to second last term

        // b is last term
        int c = a + b;
        System.out.println(c);
        PrintFibonaci(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        PrintFibonaci(a, b, n - 1);

    }

}
