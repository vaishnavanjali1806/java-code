    import java.util.Arrays;
public class progeam30 {




    static class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 3, 7, 9};
        Pair result = getMinMax(arr);

        System.out.println("Min = " + result.min + ", Max = " + result.max);
    }

    public static Pair getMinMax(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[0];
        int max = arr[n - 1];
        return new Pair(min, max);
    }
}


