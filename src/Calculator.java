import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        Calc calc;
        switch (operator) {
            case '+':
                calc = new Addition();
                break;
            case '-':
                calc = new Subtraction();
                break;
            case '*':
                calc = new Multiplication();
                break;
            case '/':
                calc = new Division();
                break;
            default:
                System.out.println("Error! Operator is not correct");
                return;
        }

        System.out.println("Result: " + calc.calculate(num1, num2));
    }
}