package ApnaCollege.recurse.recursion;

public class reverse {
    public static void reversing(int indx, String str) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        reversing(indx - 1, str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        reversing(str.length() - 1, str);
    }
}

// time complexity is 0(n)
