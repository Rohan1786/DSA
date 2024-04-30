package ApnaCollege.recurse;

public class fibo {
    public static int fibonaci1(int n) {
        if (n == 0 || n == 1) {

            return 0;
        } else {
            return n + fibonaci1(n - 1);
        }
    }

    public static void main(String[] args) {
        float res = fibonaci1(5);
        System.out.println(res);
    }
}
