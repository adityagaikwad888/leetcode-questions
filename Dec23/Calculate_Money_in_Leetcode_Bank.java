public class Calculate_Money_in_Leetcode_Bank {
    public static int totalMoney(int n) {
        
       
        if(n<=7){

            System.out.print("ok");
            int y = 0;
            for(int i = 1 ; i <= n ; i++){
                y = y + i;
            
            }
            return y;
        }
        int r = n/7; // mondays
        int x = (r)*28;
        for(int i = 0 ; i <r ; i++){
            x = x + i*7;
        }
        int m = n%7;
        
        if(m!=0){
            
        int as = r+1;
        int ans = 0 ;
        for(int i  = 0 ; i < m ; i++){
            ans = ans + as + i ;
        }
        
        x = x + ans;
        }

        return x;
    }

    public static void main(String args[]){
        System.out.println(totalMoney(7));
    }
}
