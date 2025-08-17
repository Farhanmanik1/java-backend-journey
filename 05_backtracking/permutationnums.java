import java.util.*;

class Solution {
    List<List<Integer>> allAnswers = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] newArr = new int[nums.length];
        boolean[] used = new boolean[nums.length];
        makePermutations(newArr, nums, used, 0);
        return allAnswers;
    }

    private void makePermutations(int[] newArr, int[] nums, boolean[] used, int idx) {
        if (idx == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int n : newArr) {
                permutation.add(n);
            }
            allAnswers.add(permutation);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            newArr[idx] = nums[i];
            used[i] = true;

            makePermutations(newArr, nums, used, idx + 1);

            used[i] = false;
            newArr[idx] = 0;
        }
    }
}
