class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,c1=0,c2=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==first){
                c1++;
            }
            else if(nums[i]==second){
                c2++;
            }
            else if(c1==0){
                c1=1;
                first=nums[i];
            }
            else if(c2==0){
                c2=1;
                second=nums[i];
            }
            else{
                c1--;
                c2--;
            }
        }

        List<Integer> result=new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==first)c1++;
            else if(nums[i]==second)c2++;
        }
        int mini = (int)(n / 3) + 1;
        if (c1 >= mini) result.add(first);
        if (c2 >= mini) result.add(second);

        return result;
    }
}