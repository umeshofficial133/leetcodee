class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        
        //if array size is 1 then return
        if(size==1){
            return;
        }
        /*
        nz will point to non-zero element and z will point to zero element. two pointer approach
        */

        int nz=0;
        int z=0;

        while(nz<size){
            if(nums[nz]!=0){
                int temp=nums[z];
                nums[z]=nums[nz];
                nums[nz]=temp;
                z++;
                nz++;
            }
            else{
                nz++;
            }
        }
    }
}