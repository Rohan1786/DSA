package ApnaCollege.recurse.recursionadvance;

public class permutation {
    public static void PrintPermutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String neString = str.substring(0, i) + str.substring(i + 1);
            PrintPermutation(neString, perm + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str, "");
    }
}
