class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        int max=1;

        for(int i=1; i<intervals.length; i++)
        {
            if(intervals[i][0]>=end)
            {
                max++;
                end=intervals[i][1];
            }
            else
            end=Math.min(end, intervals[i][1]);
        }
        return intervals.length-max;
    }
}