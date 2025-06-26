public class q4 {
     public static double myPow(double x, int n) {
        long N = n;
       if (n == 0) {
            return 1;
        }
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }
        double half = myPow(x, (int)(N / 2)); 
        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }

    }
    public static void main(String[] args) {
        System.out.print(myPow(2, 10));
    }
}
