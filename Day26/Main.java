

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        double result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    private static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Cannot divide by zero.");
                    System.exit(0);
                }
            default:
                System.out.println("Invalid operation.");
                System.exit(0);
                return 0;
        }
    }
}
