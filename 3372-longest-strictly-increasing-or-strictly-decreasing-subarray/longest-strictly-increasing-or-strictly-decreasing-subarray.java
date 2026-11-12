class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int inc = 1;
       int dcr = 1;
       int maxLen = 1;

       for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
             inc++;
             dcr = 1;
            }
            else if(nums[i] < nums[i - 1]){
             dcr++;
             inc = 1;
            }
            else{
                inc = 1;
                dcr = 1;
            }

            maxLen = Integer.max(maxLen, Integer.max(inc, dcr));
        }

        return maxLen;
        
    }
}