import java.util.Scanner;

public class GCD     {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd = 1;
        int min = Math.min(n1, n2);

        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
