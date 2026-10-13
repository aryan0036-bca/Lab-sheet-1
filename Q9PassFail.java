import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of three subjects (out of 100): ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total marks: " + total + " out of 300");
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
