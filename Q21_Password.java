import java.util.Scanner;

public class Q21_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "java123";
        String input;
        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();
            if (!input.equals(correctPassword)) {
                System.out.println("Wrong password. Try again.");
            }
        } while (!input.equals(correctPassword));
        System.out.println("Access granted");
    }
}
