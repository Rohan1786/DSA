public class power {
    public static int print_power(int x, int n) {
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 0;

        } else {
            return x * print_power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        System.out.println(print_power(x, n) + "=" + x + "^" + n);
    }
}
