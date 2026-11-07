class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean check = true;
        int[] nums = new int[n + 1];

        for(int i = 0; i < n; i++){
            if(digits[i] != 9){
                check = false;
            }
        }
        if(check){
            nums[0] = 1;

            int p = 1;

            while(p <= n){
                nums[p] = 0;
                p++;
            }
            return nums;
        }

        for(int i = n - 1; i >= 0; i--){

            if(digits[i] == 9){
                digits[i] = 0;
            }

            else{
                digits[i] += 1;
                break;
            }
        }

        return digits;
        
    }
}