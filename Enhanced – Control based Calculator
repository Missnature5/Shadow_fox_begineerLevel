import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enhanced Calculator");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicArithmeticOperations(scanner);
                    break;
                case 2:
                    scientificCalculations(scanner);
                    break;
                case 3:
                    unitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void basicArithmeticOperations(Scanner scanner) {
        System.out.println("Basic Arithmetic Operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addition(scanner);
                break;
            case 2:
                subtraction(scanner);
                break;
            case 3:
                multiplication(scanner);
                break;
            case 4:
                division(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void subtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void division(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

    private static void scientificCalculations(Scanner scanner) {
        System.out.println("Scientific Calculations");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                squareRoot(scanner);
                break;
            case 2:
                exponentiation(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Result: " + result);
    }

    private static void exponentiation(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void unitConversions(Scanner scanner) {
        System.out.println("Unit Conversions");
        System.out.println("1. Temperature Conversion (Celsius to Fahrenheit)");
        System.out.println("2. Currency Conversion (USD to EUR)");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                temperatureConversion(scanner);
                break;
            case 2:
                currencyConversion(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void temperatureConversion(Scanner scanner) {
