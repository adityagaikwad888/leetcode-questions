import java.util.*;

public class Q451_sort_charators_by_frequency{

    public static void frequencySort(String s) {
        
        int ch[] = new int[57];
        for (int i = 0; i < s.length() ; i++) {
            
            int index = (int)s.charAt(i)-65; 
            ch[index]++;
            index = 0 ;
        }

        String n;


        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
    }
    public static void main(String args[]){
        frequencySort("aaaAAbZZZZ");
    }
}