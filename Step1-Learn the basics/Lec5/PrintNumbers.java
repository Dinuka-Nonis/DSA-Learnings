import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if (i < N)
                System.out.print(i + ", ");
            else
                System.out.print(i);
        }

        sc.close();
    }
}
