import java.util.*;

public class q2 {
 public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h =new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            h.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }
       int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
