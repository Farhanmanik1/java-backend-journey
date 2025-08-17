public class strictlysorted {
    public static boolean isSorted(int arr[], int idx) {
        // if we assign arr.length only withou minus 1 the below comparison statement
        // will throw error
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int idx = 0;
        System.out.println(isSorted(arr, idx));
    }
}
