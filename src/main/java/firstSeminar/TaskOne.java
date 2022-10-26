package firstSeminar;

public class TaskOne {
    public class TaskTwo {
        class Solution {
            public int subtractProductAndSum(int num) {
                int prod = 1;
                int sum = 0;
                while (num > 0){
                    int digit = num % 10;
                    prod *= digit;
                    sum += digit;

                    num /= 10;
                }
                return prod - sum;
            }
        }
    }

}
