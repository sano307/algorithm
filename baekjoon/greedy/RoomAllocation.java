import java.io.*;
import java.util.*;

class Meeting {
    private int startTime;
    private int endTime;

    Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    int getStartTime() {
        return startTime;
    }

    int getEndTime() {
        return endTime;
    }
}

public class RoomAllocation {
    public static void main(String[] args) {

        /**
         * - Input
         * 11
         * 1 4
         * 3 5
         * 0 6
         * 5 7
         * 3 8
         * 5 9
         * 6 10
         * 8 11
         * 8 12
         * 2 13
         * 12 14
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Meeting> meetings = new ArrayList<>();
        while (sc.hasNextLine()) {
            if (!sc.hasNextLong()) {
                break;
            }

            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            meetings.add(new Meeting(startTime, endTime));
        }
        sc.close();

        Collections.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                if (m1.getEndTime() > m2.getEndTime()) {
                    return 1;
                } else if (m1.getEndTime() < m2.getEndTime()) {
                    return -1;
                }
        
                return m1.getStartTime() - m1.getEndTime();
            }
        });

        int start;
        int end = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            start = meetings.get(i).getStartTime();

            if (start >= end) {
                end = meetings.get(i).getEndTime();
                count++;
            }
        }

        System.out.println(count);
        /**
         * - Output
         * 4
         */
    }
}
