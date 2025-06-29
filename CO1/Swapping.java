import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using third variable): a = " + a + ", b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping again (without third variable): a = " + a + ", b = " + b);

        sc.close();
    }   

}