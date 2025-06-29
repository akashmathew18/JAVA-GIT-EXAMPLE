import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0)
            System.out.println("Positive number.");
        else if (num < 0)
            System.out.println("Negative number.");
        else
            System.out.println("Zero.");

        sc.close();
    }
}