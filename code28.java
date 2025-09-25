public class program58 {
    public static void main(String[] args) {
        String str = ("abcde");
        
        int target = 'c';
        boolean flag = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    
        }
           
        }
    
    

