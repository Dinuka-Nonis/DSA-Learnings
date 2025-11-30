import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums.length==0){
            return ans;
        }

        int max = nums[nums.length-1];
        ans.add(nums[nums.length-1]);

        for (int i = nums.length-2 ; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }

}
