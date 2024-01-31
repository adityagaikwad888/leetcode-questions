import java.util.Arrays;
import java.util.Comparator;

public class temp {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,2},{3,4},{4,5},{3,0}};
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+"  "+arr[i][1]);
            System.out.println();
        }
    }
}
