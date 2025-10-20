import java.util.Scanner;

public class NumbersSum {

    // Recursive method
    int NnumbersSum(int N) {
        // Base case
        if (N == 1)
            return 1;
        // Recursive case
        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Create an object of the same class
        NumbersSum obj = new NumbersSum();
        int result = obj.NnumbersSum(N);

        System.out.println("Sum of first " + N + " natural numbers is: " + result);
    }
}
