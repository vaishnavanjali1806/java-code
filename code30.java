public class program60 {
    public static void main(String[] args) {
        String str = "(()()()())";
        String result = removeOuterParentheses(str);
        System.out.println("Result: " + result);
    }
    public static String removeOuterParentheses(String s){
        int count = 0; 
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

                if(ch == '('){
                    if(count > 0){
                        result.append(ch);
                    }
                    count++;
                }
                else{
                    count--;
               
                    if(count > 0){
                        result.append(ch);
                    }
                 
                }
            }
        
        return result.toString();
    }

    
}
 
