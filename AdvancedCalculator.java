import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Advanced Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Power (^)");
        System.out.println("7. Square Root (√)");

        System.out.print("Enter your choice (1-7): ");
        int choice = scanner.nextInt();

        double num1 = 0, num2 = 0, result = 0;

        // For operations that require two numbers
        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
        } else if (choice == 7) { // For square root
            System.out.print("Enter the number: ");
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid choice. Please restart the program.");
            return;
        }

        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5: // Modulus
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            case 6: // Power
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 7: // Square Root
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Square root of a negative number is not real.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }
}

