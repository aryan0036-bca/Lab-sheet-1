import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer");
        } else {
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println("Perfect number");
            } else {
                System.out.println("Not a perfect number");
            }
        }

        sc.close();
    }
}
