
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value : ");
    int num = sc.nextInt();
        int count = 0;
        int temp = Math.abs(num);

        if (temp == 0) {
            count = 1; // 0 has one digit
        } else {
            while (temp > 0) {
                temp = temp / 10; // remove last digit
                count++;
            }
        }
    System.out.println("input :"+num);
System.out.println("Number of digits: "+count);


}
}

