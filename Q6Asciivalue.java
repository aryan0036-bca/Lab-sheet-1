import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + (int) ch);

        sc.close();
    }
}
