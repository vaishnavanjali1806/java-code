import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day){
            case "Sunday", "Monday", "Tuesday", "Weansday", "Thusday" -> System.out.println("Weekday");
            case "Friday", "Saturday" -> System.out.println("Weekday");
        }
 
    }
}
