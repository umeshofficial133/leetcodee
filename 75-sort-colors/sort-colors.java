class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int temp;
        while(mid<=end){
            switch(nums[mid]){
                case 0:{
                    temp=nums[mid];
                    nums[mid]=nums[start];
                    nums[start]=temp;
                    start++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=nums[mid];
                    nums[mid]=nums[end];
                    nums[end]=temp;
                    end--;
                    break;
                }
            }
        }
    }
}