class Solution {
    public int missingNumber(int[] nums) {
        //there are two ways we can solve this problem
        //one by xor approach and other by sum approach(I am using xor approach)

        int size=nums.length;
        int result=0;
        for(int i=1;i<=size;i++){
            result=result^nums[i-1]^i;
        }

        return result;
    }
}