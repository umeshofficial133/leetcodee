class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash_set=new HashSet<Integer>();
        
        for(int num:nums){
            hash_set.add(num);
        }
        
        int max_length=0;
        for(int num:nums){
            int curr_num=num;
            int curr_length=1;
            //if num-1 exists then dont proceed. we will proceed only if it is the smallest in its sequence
            if(!hash_set.contains(num-1)){
                while(hash_set.contains(curr_num+1)){
                    curr_num++;
                    curr_length++;
                }
            }
            max_length=Math.max(max_length,curr_length);
        }
        return max_length;
    }
}