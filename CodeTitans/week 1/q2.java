import java.util.LinkedList;
import java.util.Queue;

public class q2 {
    public static void moveZeroes(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        int i=0;
        while(!q.isEmpty()){
            if(q.peek()!=0){
                nums[i]=q.remove();
                i++;
            }
            else{
                q.remove();
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
