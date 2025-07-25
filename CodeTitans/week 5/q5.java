
public class q5 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] nums, int l, int r) {
        if (l >= r)
            return;
        int pivot = nums[l + (r - l) / 2];
        int i = l, j = r;
        while (i <= j) {
            while (nums[i] < pivot)
                i++;
            while (nums[j] > pivot)
                j--;
            if (i <= j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            }
        }
        if (l < j)
            quickSort(nums, l, j);
        if (i < r)
            quickSort(nums, i, r);
    }
}
