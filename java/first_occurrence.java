// import java.util.*;

public class first_occurrence{
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        for (int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            String temp = haystack.substring(i,i+needle.length());
            if(temp.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}