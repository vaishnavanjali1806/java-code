public class program22 {
        public static void main (String [] args){
            program22 obj = new program22();
        String result = obj.removeOuterParentheses("(()())(())");
        System.out.println(result);
        }
        public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = "";
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ')') count --;
            if (count != 0 ) ans += s.charAt(i);
            if(s.charAt(i) == '(') count ++;
                
            }
               return ans;
        
    }
}
