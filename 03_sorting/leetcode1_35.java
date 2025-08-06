public class leetcode1_35 {
    public static int SearchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int target = 5;
        int index = SearchInsert(arr, target);
        System.out.println("The Target should be at index " + index);
    }
}
