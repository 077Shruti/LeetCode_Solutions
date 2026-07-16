class Solution {
    public int countDigits(int num) {
        int dummy=num;
        int ans=0;
        while(dummy>0){
            int a=dummy%10;
            if(num%a==0) ans++;
            dummy=dummy/10;
        }
        return ans;
       
        
    }
}