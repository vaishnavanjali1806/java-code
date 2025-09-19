import java.util.Arrays;

public class program34 {
    public static void main(String[] args) {
         int[] arr = {7, 3, 2, 4, 9, 12, 56};
         int m = 3;
         int n = arr.length;
         int ans = Integer.MAX_VALUE;
         Arrays.sort(arr);

         for(int i = 0; i < n-m+1; i++){
            int minelement = arr[i];
            int maxelement = arr[i+m-1];
            ans= Math.min(ans, maxelement-minelement);

         }
         System.out.println(ans);
    }
    
    
}
