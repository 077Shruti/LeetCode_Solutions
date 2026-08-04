class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=l+1;
        while(r<nums.length){
            if(nums[l]!=0){
                l++;
            }
            else if(nums[r]!=0){
                swap(nums,l,r);
                l++;

            }
            else if(nums[r]==0){
                r++;
                continue;
            }
            r=l+1;
        }



        
    }
     public void swap(int[] nums,int start,int end){
      
       int t=nums[start];
       nums[start]=nums[end];
       nums[end]=t;
        
    
    }
}