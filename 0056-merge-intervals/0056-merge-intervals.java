class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int s=intervals[0][0];
        int e=intervals[0][1];
        ArrayList<int[]> li=new ArrayList<>();
        
        for (int i = 1; i < n; i++) {
            if(intervals[i][0]<=e){
                e=Math.max(e,intervals[i][1]);
            }
            else{
                li.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        li.add(new int[]{s,e});
        
         return li.toArray(new int[li.size()][]);

    }
}