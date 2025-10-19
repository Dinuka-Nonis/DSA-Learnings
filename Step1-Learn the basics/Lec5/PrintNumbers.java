import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Choose an option:");
        System.out.println("1. Print from 1 to N");
        System.out.println("2. Print from N to 1");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Print from 1 to N
            for (int i = 1; i <= N; i++) {
                if (i < N)
                    System.out.print(i + ", ");
                else
                    System.out.print(i);
            }
        } else if (choice == 2) {
            // Print from N to 1
            for (int i = N; i >= 1; i--) {
                if (i > 1)
                    System.out.print(i + ", ");
                else
                    System.out.print(i);
            }
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
