class Solution {
    public int majorityElement(int[] nums) {

        //we will solving this using moore's voting algorithm
        int element=nums[0];
        int count=1;
        
        //step 1: find majprity element
        for(int i=1;i<nums.length;i++)
        {
            if(count==0){
                count=1;
                element=nums[i];
            }
            else if(nums[i]==element){
                count++;
            }else{
                count--;
            }
        }
        
        int count1=0;
        //step 2: verify majority element
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count1++;
            }
        }

        if(count1>(nums.length/2)){
            return element;
        }

        return -1;

    }
}