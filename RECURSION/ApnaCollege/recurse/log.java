package ApnaCollege.recurse;

public class log {
    public static int Printlog(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return Printlog(x, n / 2) * Printlog(x, n / 2);
        }
        return Printlog(x, n / 2) * Printlog(x, n / 2) * x;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = Printlog(x, n);
        System.out.println(ans);
    }

}
