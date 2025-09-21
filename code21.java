public class program52 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n =height.length;
        int maxwater = 0;
        int left = 0;
        int right =height.length-1;

        while (left < right) {
            int width = right-left;
            int h = Math.min(height[left], height[right]);
            int currentWater = width * h;
            maxwater = Math.max(maxwater, currentWater);

            if(height[left] < height[right]){
                left ++;
            }else{
                right--;
            }


        }
        System.out.println(maxwater);

    }
}
