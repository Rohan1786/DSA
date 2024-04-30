public class Fibnaci {
    public static int Fibonaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 0) {
            return -1;

        } else {
            return n + Fibonaci(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Fibonaci(n));
    }
}
