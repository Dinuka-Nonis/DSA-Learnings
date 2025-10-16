import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to check palindrome: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = Math.abs(num);
        int dup = temp; // store original value

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (dup == rev) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
