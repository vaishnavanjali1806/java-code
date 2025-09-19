public class program33 {
    public static void main (String[] args){
        int[] arr = {3,-2,-3,4,10,-1};
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
           maxSum = Math.max(maxSum, currentSum);


        }
        System.out.println("maximum subArray sum =" + maxSum);
    }
    
    
}
