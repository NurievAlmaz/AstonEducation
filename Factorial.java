public class Factorial {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Dont use negative number");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
