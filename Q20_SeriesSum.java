import java.util.Scanner;

public class Q20_SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        double sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum + i / Math.pow(2, i);
        }
        System.out.println("Sum of the series = " + sum);
    }
}
