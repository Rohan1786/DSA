package ApnaCollege.recurse.recursionadvance;

public class TotalPaths {
    public static int PrintPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // for downwords
        int downWords = PrintPaths(i + 1, j, n, m);

        // for right
        int right = PrintPaths(i, j + 1, n, m);

        return downWords + right;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(PrintPaths(0, 0, n, m));
    }
}
