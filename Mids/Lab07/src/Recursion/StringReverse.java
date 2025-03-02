package Recursion;
// Reverse a string.
public class StringReverse {
    static void reverse(String str, int idx) {
        if (idx < 0)
            return;
        System.out.print(str.charAt(idx));
        reverse(str, --idx);
    }

    public static void main(String[] args) {
        String str = "abcd";
        int len = str.length();
        reverse(str, len - 1);
    }
}
