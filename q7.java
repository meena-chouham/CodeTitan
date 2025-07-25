import java.util.*;

public class q7 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, i = 0, j = 1, n = nums.length;
        while (i < n && j < n) {
            if (i == j || nums[j] - nums[i] < k)
                j++;
            else if (nums[j] - nums[i] > k)
                i++;
            else {
                count++;
                i++;
                while (i < n && nums[i] == nums[i - 1])
                    i++;
            }
        }
        return count;
    }
}
