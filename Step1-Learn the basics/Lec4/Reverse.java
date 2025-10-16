import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to reverse: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = Math.abs(num); // handle negatives

        while (temp > 0) {
            int digit = temp % 10;        // get the last digit
            reversed = reversed * 10 + digit; // add digit to reversed number
            temp = temp / 10;             // remove last digit
        }

        if (num < 0) {
            reversed = -reversed; // preserve negative sign
        }

        System.out.println("Reversed number: " + reversed);
    }
}
