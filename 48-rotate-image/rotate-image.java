class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //reverse whole matrix
        for(int i=0;i<n;i++){
            reverse(matrix,i,n);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n-1){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[n-1-j][n-1-i];
                    matrix[n-1-j][n-1-i]=temp;
                }
            }
        }
    }

    static void reverse(int[][] matrix,int i,int n){
        int start=0;
        int end=n-1;

        while(start<=end){
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;
            end--;
        }
    }
}