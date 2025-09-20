public class program38 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int n = nums.length;
        int target = 0;
        int i = 0;
        int j = nums.length - 1;
        int result = -1;
        
        while (i <= j) {
            int mid = (i + j)/2;
            if(nums[mid] == target) {
                result = mid;
                break;
            }     
             if(nums[i] <= nums[mid]){  
                if(nums[i] <= target && target <= nums[mid]){
                    j = mid -1;
                }   else{
                    i = mid+1;
                } 

        } else{
        if (nums[mid] <= target && target <= nums[j]) {
            i = mid +1;

            
        }else{
            j= mid -1;
        }
    }

        }
        System.out.println(result);
    }
    
}
