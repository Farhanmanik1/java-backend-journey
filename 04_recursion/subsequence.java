public class subsequence {
    public static void subsequences(String str, int idx, String newstr) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char newchar = str.charAt(idx);
        subsequences(str, idx + 1, newstr + newchar);
        subsequences(str, idx + 1, newstr);
    }

    public static void main(String[] args) {
        String str = "abc";
        String newstr = "";
        subsequences(str, 0, newstr);
    }
}
// toughest so far to understand please understand this