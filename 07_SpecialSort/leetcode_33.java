public static int leetcode_33(int[] arr, int target,int left, int right){
    if(left>right){
        return -1;
    }

    int mid = left + ((right -left)/2);
    if(arr[mid] == target){
        return mid;
    }

    if(arr[mid] >= arr[left]){

        if (arr[left] <= target && target <= arr[mid]){
            return leetcode_33(arr, target, left, mid-1);
        }
        else{
            return leetcode_33(arr, target, mid+1, right);

        }
    }else{
        if(arr[mid] <= target && target <=arr[right]){
            return leetcode_33(arr, target, mid+1, right);
        }
        else{
            return leetcode_33(arr, target, left, mid-1);
        }
    }
}

public static void main(String[] args) {
    int arr[] = {5,6,7,8,0,1,2,3,4};
    int target = 5;
    int right = arr.length-1;
    int n =leetcode_33(arr, target, 0, right);
    System.out.println(n);
}