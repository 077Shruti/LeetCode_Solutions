class Solution {
    public int firstMissingPositive(int[] A) {
        boolean[] visitor=new boolean[A.length+1];
        visitor[0]=true;
        for(int i=0;i<A.length;i++){
           if(A[i]>0 && A[i]<visitor.length){
               visitor[A[i]]=true;
           }
        }
        
        for(int i=0;i<visitor.length;i++){
            if(visitor[i]==false){
                return i;

            }
        }
        return A.length+1;
         
        
    }
}