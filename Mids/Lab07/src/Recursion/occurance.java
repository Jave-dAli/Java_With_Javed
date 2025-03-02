package Recursion;

// find 1st and last occ of an element in a str void(String str, int idx, char element)
public class occurance {
    static int first = -1;
    static int last = -1;

    static void occurance(String str, int idx, char element) {
        if (idx == str.length())
            return;

        if (str.charAt(idx) == element) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        occurance(str, ++idx, element);
    }

    public static void main(String[] args) {
        String str = "abubakar";
        char c = 'a';
        int idx = 0;
        occurance(str, idx, c);
        System.out.println("First: "+first);
        System.out.println("Last: "+last);
    }
}
