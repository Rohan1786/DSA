package ApnaCollege.recurse;

public class factorial {
    public static int printFactorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * printFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result1 = printFactorial(1);
        System.out.println(result1);
    }
}
