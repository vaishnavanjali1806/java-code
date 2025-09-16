import java.util.Arrays;

public class program23 {
    public static void main(String[] args) {
        String s = "Hiii my name is anjali";

        String[] arr = s.trim().split("\\s+");
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        
        System.out.println(String.join(" ", arr));
    }
}
