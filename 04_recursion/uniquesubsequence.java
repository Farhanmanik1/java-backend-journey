import java.util.*;

public class uniquesubsequence {
    public static void subsequences(String str, int idx, String newstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char newchar = str.charAt(idx);
        subsequences(str, idx + 1, newstr + newchar, set);
        subsequences(str, idx + 1, newstr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        String newstr = "";
        subsequences(str, 0, newstr, set);
    }
}
// toughest so far to understand please understand this