class Program26 {

    // Custom Pair class
    static class Pair {
        int min;
        int max;
        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        Pair result = getMinMax(arr);
        System.out.println("Min = " + result.min + ", Max = " + result.max);
    }

    public static Pair getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new Pair(min, max);
    }
}
