package secondSeminar;

public class taskRecurs {
    public static void main(String[] args) {
        findPath(1, 7, 2, 2, "");
        System.out.println(numPow(2, 5));
        System.out.println(numPow(2, 10));
        System.out.println(numPow(2, -10));
        System.out.println(numPow(-2, -10));
        System.out.println(numPow(2, 0));
        System.out.println(numPow(2, 1));
        System.out.println(numPow(1, 10));
    }

    private static void findPath(int src, int target, int adder, int mult, String path) {
        if (src > target) return;
        if (src == target) {
            System.out.println(path);
            System.out.println("--------");
            return;
        }
        findPath(src + adder, target, adder, mult, path + src + "+" + adder + "\n");
        findPath(src + mult, target, adder, mult, path + src + "*" + mult + "\n");
    }

    private static double numPow(double base, int pow) {
        if (pow == 0) return 1;
        if (pow == 1) return base;
        if (base == 0 || base == 1) return base;
        if (pow < 0) return numPow(1 / base, -pow);
        double half = numPow(base, pow / 2);
        double result = half * half;
        if (pow % 2 == 1) result *= base;
        return result;
    }

    boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 != 1) {
            n /= 2;
        }
        return n == 1;
    }

    private boolean helper(int n){
        if (n == 1) return  true;
        if (n <= 0 || n % 2 == 1) return  false;
        return helper(n/2);
    }
}
