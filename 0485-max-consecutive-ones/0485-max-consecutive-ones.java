class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right=0;
        int max=0;
        int ans=0;
        while(right<nums.length){
            if(nums[right]==0){
                ans=Math.max(max,right-left);
                left=right+1;

            }
            max=Math.max(ans,right-left+1);
            right++;
        }
        return max;
        
    }
}