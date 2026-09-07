class Solution {
    public int firstMissingPositive(int[] A) {
        for(int i=0;i<A.length;i++){
            while (A[i] >= 1 &&
                   A[i] <= A.length &&
                   A[A[i] - 1] != A[i]) {

                swap(A[i] - 1, i, A);
                
            }
        }
        for(int i=0;i<A.length;i++){
           if(A[i]!=i+1){
                return i+1;
           }
        }
        return A.length+1;
         
        
    }
    public void swap(int a,int b,int[] A ){
        int t=A[a];
        A[a]=A[b];
        A[b]=t;
    }
}