import java.util.Scanner;

public class Q25_LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                ? year + " is a Leap Year"
                : year + " is not a Leap Year";
        System.out.println(result);
    }
}
