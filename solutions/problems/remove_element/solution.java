public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // This will count the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Place the element at index k
                k++;  // Increment k for the next position
            }
        }

        return k;  // Return the number of elements not equal to val
    }
}
