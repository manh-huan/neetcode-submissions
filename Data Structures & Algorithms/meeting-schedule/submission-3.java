/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        List<Integer> start = intervals.stream().map(i -> i.start).sorted().toList();
        List<Integer> end = intervals.stream().map(i -> i.end).sorted().toList();
        int i = 0;
        int j = 0;
        int inMeeting = 0;
        int maxRoom = 0;


        if(intervals.size() == 0) {
            return true;
        }

        while ( i < intervals.size()  && j < intervals.size()) {
            if(start.get(i) < end.get(j)) {
                inMeeting++;
                i++;
            } else {
                inMeeting --;
                j++;
            }
            maxRoom = Math.max(maxRoom, inMeeting);
        }
        return maxRoom == 1;
    }
}
