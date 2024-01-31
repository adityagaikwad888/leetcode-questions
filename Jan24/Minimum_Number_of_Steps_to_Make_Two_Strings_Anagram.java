import java.util.*;


public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {
    public int hashfunction(char x){
        int index = x -'a';
        return index;
    }
    public int minSteps(String s, String t) {
        int ans = 0;
        int arr[] = new int[26];
        for(int i=0; i<s.length() ; i++){
            arr[hashfunction(s.charAt(i))]++;
            arr[hashfunction(t.charAt(i))]--;
        }
        for(int i=0 ; i<26 ; i++){
            if (arr[i]<0 || arr[i]>0) {
                ans += Math.abs(arr[i]);
            }
        }
        return ans/2;
    }

    public static void main(String args[]){

    }
}
