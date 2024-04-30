public class Rec1 {
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {

        int n = 5;
        int res = factorial(n);
        System.out.println(res);
    }
}
