import java.util.Arrays;

public class leetcode2_344 {
    public static void reverseastring(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseastring(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char[] s = { 'H', 'e', 'l', 'l', 'o' };
        int len = s.length;
        reverseastring(s, 0, len - 1);
        System.out.println(Arrays.toString(s));
    }
}
