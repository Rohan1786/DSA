package ApnaCollege.recurse.recursion;

public class lastX {
    public static String moveXvalue(String str, int index, int count) {
        // Base case: If index reaches the end of the string, return the string
        if (index == str.length()) {
            // Append 'x' characters based on the count
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < count; i++) {
                result.append('x');
            }
            return result.toString();
        }

        char currentChar = str.charAt(index);

        // If current character is 'x', increase count
        if (currentChar == 'x') {
            count++;
        } else {
            // If current character is not 'x', append it to the result
            str = str.substring(0, index - count) + currentChar + str.substring(index - count + 1);

        }

        // Recur for the next index
        return moveXvalue(str, index + 1, count);
    }

    public static void main(String[] args) {
        String str = "abxcxxxd";
        String result = moveXvalue(str, 0, 0);
        System.out.println(result); // Output: abcdxxxx
    }
}
