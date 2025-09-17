 class program25 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 9, -12, 17,93};
        program25 obj = new program25();
       System.out.println("Max Subarray Sum = " + obj.maxSumArray(nums));
    }
    public int maxSumArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++){
             currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }
  
    
}
