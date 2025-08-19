import java.util.*;

class Solution {
    List<List<String>> res = new ArrayList<>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        recur(s, 0, new ArrayList<>());
        return res;
    }

    // palindrome function
    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void recur(String s, int partIndex, List<String> sublist) {
        // base
        if (partIndex == n) {
            res.add(new ArrayList<>(sublist));
            return;
        }
        // explore the pos
        for (int end = partIndex; end < n; end++) {
            if (isPalindrome(s, partIndex, end)) {
                // add in list
                sublist.add(s.substring(partIndex, end + 1));
                // explore
                recur(s, end + 1, sublist);
                // backtrack
                sublist.remove(sublist.size() - 1);
            }
        }
    }
}