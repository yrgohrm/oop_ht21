package se.yrgo.math;

public final class Utils {
    private Utils() {}

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }    
    }
}
