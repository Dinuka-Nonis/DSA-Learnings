import java.util.Scanner;

public class FibonacciRecursive {
    
    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case F(0)
        } else if (n == 1) {
            return 1; // Base case F(1)
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        int result = fibonacci(n);
        System.out.println("F(" + n + ") = " + result);
    }
}
