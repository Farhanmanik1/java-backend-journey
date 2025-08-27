public class QuickSort{
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,2};
        int n = arr.length;
        qs(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void qs(int arr[],int low,int high){
        if(low<high){
            int pdx=partition(arr,low,high);
            qs(arr, low, pdx-1);
            qs(arr, pdx+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }
}