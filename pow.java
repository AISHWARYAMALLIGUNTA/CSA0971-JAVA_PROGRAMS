class Pow{
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return power(x, n);
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.printf("x = %.5f, n = %d\n", x, n);
        double result = myPow(x, n);
        System.out.printf("Output: %.5f\n", result); // Output: 1024.00000
    }
}
