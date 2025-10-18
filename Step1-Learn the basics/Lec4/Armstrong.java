public class Armstrong {

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        // count number of digits
        int digits = String.valueOf(n).length();

        // calculate sum of each digit raised to the power of digits
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        // check if equal to original number
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));  // true
        System.out.println(isArmstrong(12));   // false
        System.out.println(isArmstrong(370));  // true
        System.out.println(isArmstrong(9474)); // true
    }
}
