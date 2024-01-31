import java.util.*;

public class Check_If_Two_String_Arrays_are_Equivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String S1 = new String("");
        String S2 = new String("");

        for(int i = 0 ; i < word1.length ; i++){
            S1 = S1.concat(word1[i]);
        }
        for(int i = 0 ; i < word2.length ; i++){
            S2 = S2.concat(word2[i]);
        }

        System.out.println(S1);
        System.out.println(S2);

        if (!S1.equals(S2)) {
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String word1[] = {"a", "cb"};
        String word2[] = {"ab", "c"};

        if (arrayStringsAreEqual(word1,word2)) {
            System.out.println("ok");
        }

        sc.close();
    }

}