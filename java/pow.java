import java.util.*;


public class pow {
    public static double negativePow(double x, int n){
        long temp = n;
        if (n < 0){
            temp = -temp;
        }
        double ans = 1 ;
        while (temp > 0 ){
            if ((temp & 1) != 0 ){
                ans = ans * x;
            }
            x = x * x;
            temp = temp>>1;
        }
        return ans;
        
    }
    public static double myPow(double x, int n) {
        return n<0 ? 1/negativePow(x, n) : negativePow(x, n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
        sc.close();
    }
}
