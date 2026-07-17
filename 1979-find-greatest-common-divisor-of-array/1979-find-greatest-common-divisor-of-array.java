class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
        
    }
    public int gcd(int A,int B){
        if(A==0) return B;
        if(B==0) return A;
        while(A>0 && B>0){
            if(A>B) {
                A=A-B;
            }else{
                B=B-A;
            }
        }
        return A==0?B:A;
    }
}