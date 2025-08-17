import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subset(nums, 0, new ArrayList<>());
        return res;
    }

    public void subset(int nums[], int index, List<Integer> sublist) {
        // base case
        if (index == nums.length) {
            res.add(new ArrayList<>(sublist));
            return;
        }
        // pick
        sublist.add(nums[index]);
        subset(nums, index + 1, sublist);

        // while backtracking we need to remove the last added element
        sublist.remove(sublist.size() - 1);
        subset(nums, index + 1, sublist);
    }
}