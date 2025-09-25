public class program62 {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int n = num.length() - 1;  

        while(n >= 0){
            int i = num.charAt(n)-'0';
            if(i % 2 != 0){
                return num.substring(0, n+1);
            }
            n--;
        }
        return "";
    }
}
