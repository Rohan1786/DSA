package ApnaCollege.recurse.recursion;

public class hanoitower {
    public static void TowerOfHanoi(int n, String src, String helper, String Dest) {
        if (n == 1) {
            TowerOfHanoi(n, src, Dest, Dest);
            return;
        }
        TowerOfHanoi(n - 1, src, helper, Dest);
        TowerOfHanoi(n - 1, helper, src, Dest);

    }

    public static void main(String[] args) {
        int n = 3;

    }

}
