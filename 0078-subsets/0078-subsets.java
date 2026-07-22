class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> li = new ArrayList<>();
         check(0,nums,ans,li);
         return ans;    
    }
    public void check(int i,int[] nums,List<List<Integer>> ans,List<Integer> li){
        if(i==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        check(i+1,nums,ans,li);
        li.remove(li.size()-1);
        check(i+1,nums,ans,li);
    }
}