import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        int converted = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("Converted integer: " + converted);

        sc.close();
    }
}
