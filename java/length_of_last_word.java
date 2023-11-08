
public class length_of_last_word {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length()-1 ; i >=0 ; i--){
            if(s.charAt(i) != ' '){
                count++;
                if( i == 0 || s.charAt(i-1) == ' '){
                    return count;
                }
            }
        }
        return count;
    }
}
