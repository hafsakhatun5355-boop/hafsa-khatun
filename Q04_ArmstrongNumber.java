import java.util.Scanner;

public class Q04_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + (int) Math.pow(d, digits);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
