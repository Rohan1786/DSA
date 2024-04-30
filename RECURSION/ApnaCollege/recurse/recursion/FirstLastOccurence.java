package ApnaCollege.recurse.recursion;

public class FirstLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void Findoccurence(int index, String Str, char element) {
        if (index == Str.length()) {
            System.out.println(first);
            System.out.println(last);
        }
        char currentChar = Str.charAt(index);

        if (currentChar == element) {
            if (first == -1) {
                first = index;

            } else {
                last = index;
            }
        }
        Findoccurence(index + 1, Str, element);

    }

    public static void main(String[] args) {

        String Str = "aabbbaabbbaccb";
        Findoccurence(0, Str, 'b');

    }
}
