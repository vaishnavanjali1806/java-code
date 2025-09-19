public class progeam32 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,8,9};
        int start = 1, end = 5;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = start; i < end; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] < max){
                max = arr[i];
            }
        }
        System.out.println("Minmum subArray : " + min);
        System.out.println("Maxmum subArray : " + max);
    }
    
}
