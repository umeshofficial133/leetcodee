class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans=new ArrayList<>();

        //Map of Integer and its group
        Map<Integer,List<Integer>> mp=new HashMap<>();
        
        //traverse 
        for(int i=0;i<groupSizes.length;i++){
            //if integer is not there in the map
            if(!mp.containsKey(groupSizes[i])){
                mp.put(groupSizes[i],new ArrayList<>());
            }

            //add index to the list
            List<Integer> group=mp.get(groupSizes[i]);
            group.add(i);

            //if list size becomes equal to element then store it in answer ans empty it
            if(group.size()==groupSizes[i]){
                ans.add(group);
                mp.remove(groupSizes[i]);
            }

        }

        return ans;
    }
}