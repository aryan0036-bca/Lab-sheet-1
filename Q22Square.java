import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length > 0 && breadth > 0) {
            if (length == breadth) {
                System.out.println("It is a square");
            } else {
                System.out.println("It is a rectangle, not a square");
            }
        } else {
            System.out.println("Invalid dimensions");
        }

        sc.close();
    }
}
