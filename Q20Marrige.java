import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(
                sc.next().charAt(0));

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible according to given criteria");
            } else {
                System.out.println("Not eligible according to given criteria");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible according to given criteria");
            } else {
                System.out.println("Not eligible according to given criteria");
            }
        } else {
            System.out.println("Invalid gender input");
        }

        sc.close();
    }
}
