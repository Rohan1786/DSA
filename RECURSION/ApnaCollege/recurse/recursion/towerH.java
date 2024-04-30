package ApnaCollege.recurse.recursion;

public class towerH {
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 0) {
            System.out.println("not going to transfer the node");
        }
        if (n == 1) {

            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        TowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 1;
        TowerOfHanoi(n, "S", "H", "D");

    }

}
