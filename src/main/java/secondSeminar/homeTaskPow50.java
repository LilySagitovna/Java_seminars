package secondSeminar;

public class homeTaskPow50 {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        else if (n % 2 == 1) return x * myPow(x, n - 1);
        else if (n % 2 == 0) return myPow(x * x, n / 2);
        else return 1 / myPow(x, -n);
    }
}

//50. Pow(x, n)
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).


//        public double myPow(double x, int n) {
//            if (n < 0) {
//                n = -n;
//                x = 1 / x;
//            }
//            double pow = 1;
//            while (n != 0) {
//                if ((n & 1) != 0) {
//                    pow *= x;
//                }
//                x *= x;
//                n >>>= 1; // оператор побитового сдвига, логический сдвиг вправо, игнорирует знак после сдвига вправо на n бит 0.
//            }
//            return pow;
//        }


