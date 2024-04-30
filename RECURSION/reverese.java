public class reverese {
    public static void Printrevereese(String str, int ind) {
        if (ind == 0) {
            System.out.println(str.charAt(0));
            return;
        }
        System.out.println(str.charAt(ind));
        Printrevereese(str, ind - 1);

    }

    public static void main(String[] args) {
        String str = "abcd";
        Printrevereese(str, str.length() - 1);
    }
}
