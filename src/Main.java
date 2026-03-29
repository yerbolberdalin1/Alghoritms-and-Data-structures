import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Simple menu to choose a task
        System.out.println("Select task (1-4):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter n: ");
            System.out.println("Result: " + sumOfSquares(scanner.nextInt()));
        } else if (choice == 2) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Sum of array: " + sumOfArray(arr, 3));
        } else if (choice == 3) {
            System.out.print("Enter b and n: ");
            System.out.println("Result: " + sumOfPowers(scanner.nextInt(), scanner.nextInt()));
        } else if (choice == 4) {
            System.out.print("Enter N: ");
            readAndPrintReverse(scanner.nextInt());
        }
    }

    // Task 1: Sum of squares
    // Complexity: O(n)
    // Explanation: The function calls itself n times, performing one square and one addition per call.
    public static int sumOfSquares(int n) {
        if (n <= 1) return 1;
        return (n * n) + sumOfSquares(n - 1);
    }

    // Task 2: Sum of array
    // Complexity: O(n)
    // Explanation: It visits each of the n elements once through recursion.
    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    // Task 3: Sum of powersf
    // Complexity: O(n)
    // Explanation: It calculates and adds n powers, growing linearly with the size of n.
    public static int sumOfPowers(int b, int n) {
        if (n == 0) return 1;
        return (int) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    // Task 4: Reverse sequence
    // Complexity: O(n)
    // Explanation: It reads n numbers into the call stack and prints them when returning.
    public static void readAndPrintReverse(int count) {
        if (count == 0) return;
        int number = scanner.nextInt(); // Store number in memory
        readAndPrintReverse(count - 1); // Call next
        System.out.print(number + " "); // Print on the way back
    }
}