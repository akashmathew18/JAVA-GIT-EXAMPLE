import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}