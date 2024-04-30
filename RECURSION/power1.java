//to print the logarithm time complexity
public class power1 {
    public static int calculate_power(int x, int n) {
        // base cases

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        // even case
        if (n % 2 == 0) {
            return calculate_power(x, n / 2) * calculate_power(x, n / 2);
        }
        // else for odd number
        else {
            return calculate_power(x, n / 2) * calculate_power(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        System.out.println(calculate_power(x, n) + "=" + x + "^" + n);
    }
}
