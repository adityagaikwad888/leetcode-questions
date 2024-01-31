import java.util.*;
import java.math.*;

public class Minimum_Time_Visiting_All_Points {
    // public double dis(int x1,int x2,int y1,int y2){
    // double distance = Math.hypot(x1-x2, y1-y2);
    // return distance;
    // }
    // public int minTimeToVisitAllPoints(int[][] points) {
    // int no_p = points.length - 1;
    // int ans = 0;

    // while (no_p > 0) {

    // }
    // }

    public int minTimeToVisitAllPoints(int[][] points) {
        int min = 0, diffX = 0, diffY = 0;
        for (int i = 0; i < points.length - 1; i++) {
            diffX = Math.abs(points[i + 1][0] - points[i][0]);
            diffY = Math.abs(points[i + 1][1] - points[i][1]);

            min += Math.max(diffX, diffY);
        }

        return min;
    }

}
