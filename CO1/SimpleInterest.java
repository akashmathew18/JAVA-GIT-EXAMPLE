import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        float p = sc.nextFloat();
        System.out.print("Enter Rate (R): ");
        float r = sc.nextFloat();
        System.out.print("Enter Time (T): ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}