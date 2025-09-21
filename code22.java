import java.util.Arrays;

public class program53 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
        int positiveIndex = 0;
        int negaveIndex = 1;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[positiveIndex] = nums[i];
                positiveIndex += 2;


            }else{
                ans[negaveIndex] = nums[i];
                negaveIndex +=2;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
    
}
