public class program61 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String[] arr = str.trim().split("\\s+");
        int i = 0; 
        int j = arr.length-1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
         System.out.println(String.join(" ", arr));

    }
    
}
