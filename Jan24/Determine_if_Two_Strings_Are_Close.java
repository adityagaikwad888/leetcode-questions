import java.util.*;


public class Determine_if_Two_Strings_Are_Close {

    public boolean closeStrings(String word1, String word2) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        if(word1.length() != word2.length()){
            return false;
        }

        int ar1[] = new int[26];
        int ar2[] = new int[26];
        for(int i=0 ; i<word1.length() ; i++){
            set.add(word1.charAt(i));
            set2.add(word2.charAt(i));
            int index1 = word1.charAt(i) - 'a';
            int index2 = word2.charAt(i) - 'a';

            ar1[index1]++;
            ar2[index2]++;
        }

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(!set.equals(set2)){
            return false;
        }

        for(int i=0 ; i<26 ; i++){
            if (ar1[i] != ar2[i]) {
                return false;
            }
        }
        return true ;
    }
}
