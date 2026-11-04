class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        int val = n*(n + 1)/2;

        if(val > sum){
            return val - sum;
        }
        
        return sum - val;
   
    }
}