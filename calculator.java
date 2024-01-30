//This comment shows that this file is now edited...


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1, num2;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    System.exit(0);
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                System.exit(0);
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        sc.close();
    }
}
