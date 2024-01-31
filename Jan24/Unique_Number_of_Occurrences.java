import java.util.*;


public class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        
        ////  Method - 1 ;
        
        // HashMap<Integer,Integer> HM = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (HM.containsKey(arr[i])) {
        //         HM.put(arr[i], HM.get(arr[i])+1);
        //     }else{
        //         HM.put(arr[i], 1);
        //     }
        // }
        // int temp[] = new int[HM.size()];
        // int ind = 0;
        // for (Map.Entry entry : HM.entrySet()) {
        //     temp[ind] = (int)entry.getValue();
        //     ind++;
        // }
        // Arrays.sort(temp);
        // for (int i = 0; i < temp.length-1; i++) {
        //     if (temp[i] == temp[i+1]) {
        //         return false;
        //     }
        // }
        // return true;
        
        

        //// Method - 2 ;


        Map<Integer, Integer> M = new HashMap<>();
        for (int num : arr) {
            if (M.containsKey(num)) {
                M.put(num, M.get(num)+1);  
            }else{
                M.put(num, 1);
            }
        }
        
        Set<Integer> S = new HashSet<>(M.values());

        return S.size() == M.size();
    }

    public static void main(String[] args) {
        
    }
}
