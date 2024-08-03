import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, result;
        char operator;

        System.out.print("Enter first number: ");
        n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        n2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            result = n1 + n2;
        } else if (operator == '-') {
            result = n1 - n2;
        } else if (operator == '*') {
            result = n1 * n2;
        } else if (operator == '/') {
            if (n2 != 0) {
ll                result = n1 / n2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}