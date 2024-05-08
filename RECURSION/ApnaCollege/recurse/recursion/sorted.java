public class sorted {
    public static boolean isSorted(int ind, int arr[]) {
        if (ind == arr.length - 1) {
            return true;
        }
        if (arr[ind] < arr[ind + 1]) {
            return isSorted(ind + 1, arr);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4 };
        System.out.println(isSorted(0, array));
    }
}
