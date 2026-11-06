class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        rotation(nums, 0, n - k - 1);
        rotation(nums, n - k, n - 1);
        rotation(nums, 0, n - 1);
        
    }

    public void rotation(int[] nums, int low , int high){
       
        while(high > low){
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;

            low++;
            high--;
        }

    }
}