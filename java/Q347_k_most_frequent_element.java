import java.util.*;


public class Q347_k_most_frequent_element {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> HM = new HashMap<>();
        HashSet<Integer> HS = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HS.add(nums[i]);
            if (HM.containsKey(nums[i])) {
                HM.put(nums[i], HM.get(nums[i])+1);

            }else{
                HM.put(nums[i], 1);
            }
        }

        int ans[][] = new int[HS.size()][2];
        int i = 0;
        for(Map.Entry entry:HM.entrySet()){
            ans[i][0] = (int)entry.getKey();
            ans[i][1] = (int)entry.getValue();
            i++;
            // System.out.print(entry.getKey()+"  "+entry.getValue());
            // System.out.println();
        }

        Arrays.sort(ans,Comparator.comparingDouble(o->o[1]));

        // for (int j = 0; j < ans.length; j++) {
        //     System.out.print(ans[j][0]+"  "+ans[j][1]);
        //     System.out.println();
        // }
        
        int oUt[] = new int[k];
        for (int j = 0; j < oUt.length; j++) {
            oUt[j] = ans[ans.length-1-j][0];
        }
        return oUt;

    }

    public static void main(String[] args) {
        int ar[] = {1,1,2,2,2,3,3,3,3,3};
        int ans[] = topKFrequent(ar, 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
