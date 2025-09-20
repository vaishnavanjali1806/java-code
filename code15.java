public class program44 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 2, 8};
        int n = arr.length;

        int[] hash = new int[n + 2]; 

       
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int repeating = -1;
        int missing = -1;

       
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        System.out.println("Repeating: " + repeating + ", Missing: " + missing);
    }
}
