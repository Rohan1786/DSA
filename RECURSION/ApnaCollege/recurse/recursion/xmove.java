package ApnaCollege.recurse.recursion;

public class xmove {
    public static void moveXvalue(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'x') {
            count++;
            moveXvalue(str, index + 1, count, newString);
        } else {
            newString += currentChar;
            moveXvalue(str, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abxcxxxd";
        moveXvalue(str, 0, 0, "");

    }
}