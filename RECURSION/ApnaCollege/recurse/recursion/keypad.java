package ApnaCollege.recurse.recursion;

public class keypad {
    public static String keypads[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKey(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypads[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printKey(str, index + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String st = "2";
        printKey(st, 0, "");
    }
}
