//moore's voting algorithm

    public static int majorityElement(int[] nums) {
        int majority = nums[0], votes =1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority = nums[i];
            }
            else if(majority == nums[i]){
                votes++;
            }
            else {
                votes--;
            }
        }
            return majority;
        }
    public static void main(String[] args) {
        int [] nums = {2,2,1,3,1,2,2};
        int n = majorityElement(nums);
        System.out.println(n);
    }
    