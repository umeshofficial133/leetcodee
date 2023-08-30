class Solution {
    public void nextPermutation(int[] nums) {
        

        int n=nums.length;
        int break_point=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                break_point=i-1;
                break;
            }
        }
        
        //if permutation is lexicographically last, then just reverse
        if(break_point==-1){
            reverse(nums,0,n-1);
            return;
        }
        
        //swap break_point with its next greater element
        for(int i=n-1;i>break_point;i--){
            if(nums[i]>nums[break_point]){
                int temp=nums[i];
                nums[i]=nums[break_point];
                nums[break_point]=temp;
                break;
            }
        }

        //reverse from breakpoint till end
        reverse(nums,break_point+1,n-1);
    }

    static void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}