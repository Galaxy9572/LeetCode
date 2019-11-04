package org.jy;

public class DividePow {

    public static double myPow(double x, int n) {
        if(n <= -1){
            x = 1 / x;
            n = - n;
        }
        return pow(x, n);
    }

    private static double pow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return x;
        }
        double result;
        double half = pow(x, n / 2);
        if(n % 2 != 0){
            result = half * half * x;
        }else {
            result = half * half;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.1, -3));
    }

}
