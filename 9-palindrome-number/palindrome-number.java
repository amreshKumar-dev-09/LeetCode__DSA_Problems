class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        int temp = x;

        while(temp > 0){
            reverse = reverse * 10 + temp%10;
            temp = temp/10;
        }

        if(original == reverse){
            return true;
        }

        return false;
    }
}