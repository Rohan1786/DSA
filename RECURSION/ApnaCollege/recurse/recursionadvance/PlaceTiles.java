package ApnaCollege.recurse.recursionadvance;

public class PlaceTiles {
    public static int PrintTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // for vertical
        int c = PrintTiles(n - m, m);

        // for horizontal
        int d = PrintTiles(n - 1, m);

        return c + d;

    }

    public static void main(String[] args) {
        int m = 4, n = 4;
        System.out.println(PrintTiles(n, m));
    }
}
