import java.util.Scanner;

public class Factorial {
    
    // Recursive function to calculate factorial
    static int factorial(int x) {
        // Base case: factorial of 1 is 1
        if (x == 1)
            return 1;
        // Recursive case
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int x = sc.nextInt();
        
        // Calculate factorial using recursion
        int result = factorial(x);
        
        // Print the result
        System.out.println("Factorial of " + x + " is: " + result);
        
        sc.close();
    }
}
