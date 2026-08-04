class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        swap(nums,0,nums.length-k-1);
        swap(nums,nums.length-k,nums.length-1);
        swap(nums,0,nums.length-1);
        
    }
    public void swap(int[] nums,int start,int end){
       while (start < end) {
       int t=nums[start];
       nums[start]=nums[end];
       nums[end]=t;
        start++;
        end--;
    }
    }
} 