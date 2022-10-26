package firstSeminar;

public class TaskFive {
    class Solution {
        public void moveZeroes(int[] nums) {
            int copyInd = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[copyInd] = nums[i];
                    copyInd++;
                }
            }

            while (copyInd < nums.length) {
                nums[copyInd] = 0;
                copyInd++;
            }
        }
    }
}
