import java.util.*;


public class temp2225 {

    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> lossor = new ArrayList<>();
        // List<Integer> winner = new ArrayList<>();

        // Stack<Integer> st = new Stack<>();
        // HashSet<Integer> sh = new HashSet<>();
        // HashSet<Integer> set1 = new HashSet<>();

        // for (int i = 0; i < matches.length; i++) {
        //     int x = matches[i][1];
        //     sh.add(x);
        //     if (!st.contains(x) && !set1.contains(x)) {
        //         st.push(x);     
        //     }else{
        //         set1.add(x);
        //         st.removeElement(x);

        //     }
        // }

        // for (int i = 0; i < matches.length; i++) {
        //     int y = matches[i][0];
        //     if (!sh.contains(y) && !winner.contains(y)) {
        //         winner.add(y);
        //     }
        // }
        // while (!st.isEmpty()) {
        //     lossor.add(st.pop());
        // }
        // lossor.sort(null);
        // ans.add(0, winner);
        // ans.add(1, lossor);
        int array[] = new int[(int)(Math.pow(10, 5))];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < matches.length; i++) {
            set.add(matches[i][0]);
            set.add(matches[i][1]);
            array[matches[i][1]]++;
        }
        List<Integer> winner = new ArrayList<>();
        List<Integer> losser = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i]==0 && set.contains(i)) {
                winner.add(i);
            }
            if (array[i]==1 && set.contains(i)) {
                losser.add(i);
            }
        }
        ans.add(0,winner);
        ans.add(1,losser);
        return ans;    
    }


    public static void main(String args[]){
        int arr[][] = {{1,5},{2,5},{2,8},{2,9},{3,8},{4,7},{4,9},{5,7},{6,8}};
        
        System.out.println(findWinners(arr));
    }    
}
