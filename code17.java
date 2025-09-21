public class program47 {
    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        int left = 0, right = height.length-1;
        int leftmax = 0, rightmax= 0, ans=0;

       while (left < right) {
        leftmax = Math.max(leftmax, height[left]);
        rightmax = Math.max(rightmax, height[right]);
         
        if(leftmax < rightmax){
            ans += leftmax - height[left];
            left ++;
        }
        else{
            ans += rightmax -height[right];
            right --;

        }
        
       }
       System.out.println(ans);
    }
    
}
