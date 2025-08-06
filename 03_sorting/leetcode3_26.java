public class leetcode3_26 {

    public static int removedup(int arr[]) {
        if (arr.length == 0)
            return 0;
        int count = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[count]) {
                count++;
                arr[count] = arr[j];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5 };
        int newLen = removedup(nums);

        System.out.println("New length: " + newLen);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLen; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}