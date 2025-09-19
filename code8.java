public class program31 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};

    
   
        int i=0 , j= arr.length-1, temp;
        while(i < j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;

        }
        for(int num: arr){
            System.out.print(num+ "");
        }

    }
}
