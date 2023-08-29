class Solution {
    public int maxSubArray(int[] nums) {
        int currMax=0,maximum=Integer.MIN_VALUE;
        
        //solved using kadane algorithm
        /*will revisit and sove it with divide and conquer or d
        dp approach*/
        for(int i=0;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maximum=Math.max(currMax,maximum);
        }

        return maximum;
    }
}