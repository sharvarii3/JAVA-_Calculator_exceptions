// Name: Pooja Ramdas
// PRN no.: 23070126091
// Batch : AIML B1 (2023-2027)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = sc.nextInt();
                double a, b;

                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Addition.add(a, b);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Subtraction.subtract(a, b);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Multiplication.multiply(a, b);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Division.divide(a, b);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        Square.square(a);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        Cube.cube(a);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        SquareRoot.squareRoot(a);
                        break;
                    case 8:
                        keepRunning = false;
                        System.out.println("Exiting Calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! " + e.getMessage());
                sc.nextLine(); // Clear buffer
            }
        }

        sc.close();
    }
}
