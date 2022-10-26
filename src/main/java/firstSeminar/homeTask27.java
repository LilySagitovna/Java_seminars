package firstSeminar;

public class homeTask27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public void main(String[] args) {
        int[] num = new int[]{3, 4, 5, 7, 8, 2, 1, 2, 0, 8};
        int n = 2;
        removeElement(num, n);
    }
}


