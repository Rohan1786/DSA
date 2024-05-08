package ApnaCollege.recurse.recursion;

import java.util.HashSet;

public class subsequence {
    public static void subsequences(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(index);

        subsequences(str, index + 1, newString + currentChar, set);

        subsequences(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);

    }
}

// time complexity of subsequence o(2^n)
