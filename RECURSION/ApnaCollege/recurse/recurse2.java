package ApnaCollege.recurse;

//to print the natural number print
public class recurse2 {
    public static void Calculate(int i, int n, int sum) {
        if (n == i) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        System.out.println(i);
        Calculate(i + 1, n, sum);

    }

    public static void main(String[] args) {
        int i = 0, n = 5;
        int sum = 0;
        Calculate(i, n, sum);

    }
}
