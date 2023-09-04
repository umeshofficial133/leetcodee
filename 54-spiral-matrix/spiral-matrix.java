class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer> result=new ArrayList<Integer>();

        int top=0,bottom=rows-1,left=0,right=cols-1;

        while(top<=bottom && left<=right){
            
            //get every top element
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            //get every right column element
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            //get every bottom element
            if(top<=bottom){ 
                //if there is only one row then it will not satisfy this if
                for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }

            //get every left element
            if(left<=right){
                //if there is only one column then it will not satisfy this if
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
}