class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row=matrix.length;
        int column=matrix[0].length;
        
        //if first row or column contains zero then we will mark it zero and handle it later separately with rowz and colz
        boolean colz=false,rowz=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    if(i==0)rowz=true;
                    if(j==0)colz=true;

                    //if element is zero then we will mark its zeroth row elment and zeroth column element as zero
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                
                //if either of zeroth row or zeroth column element is zero then mark it as zero
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        //zeroth row and column handle over here
        if(colz==true){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }

        if(rowz==true){
            for(int j=0;j<column;j++){
                matrix[0][j]=0;
            }
        }
    }
}