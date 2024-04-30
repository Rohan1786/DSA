package ApnaCollege.recurse;

public class recurse {

    // it is for print the 1,2,3,4 numbres
    // public static void printNumber(int n) {
    // if (n == 5) {
    // return;
    // }
    // System.out.println(n);
    // printNumber(n + 1);
    // }

    // it is for print the 5,4,3,2,1
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String[] args) {
        // int n = 1;
        int n = 5;

        printNumber(n);

    }
}
