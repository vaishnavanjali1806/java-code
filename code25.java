import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program54 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,1,2};
          program54 obj = new program54();  
        List<Integer> result = obj.Leaders(nums); 
        System.out.println(result); 

    }

    public List<Integer> Leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
     
        
        if(n == 1){
            ans.add(nums[0]);
            return ans;
        }
        int maxi = nums[n-1];
        ans.add(maxi);
        for(int i = n-2; i >= 0; i--){
            if(nums[i] >= maxi){
          maxi = nums[i];
          ans.add(nums[i]);
        }
    }
        Collections.reverse(ans);
        return ans;

          
    }
    

}
