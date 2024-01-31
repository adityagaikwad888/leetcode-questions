import java.util.*;

public class Largest_Odd_Number_in_String {
    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n-1 ; i>=0 ; i--) {
            if ((num.charAt(i)-'0')%2!=0) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String args[]) {
        String strtemp = "122221";
        System.out.println(largestOddNumber(strtemp));
    }

}