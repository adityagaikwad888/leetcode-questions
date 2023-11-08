public class num_of_even_odd_bit {

    public int[] evenOddBit(int n) {
        int e = 0, o = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                e++;
            n >>= 1;
            if ((n & 1) == 1)
                o++;
            n >>= 1;
        }
        int a[] = { e, o };
        return a;
    }
}
