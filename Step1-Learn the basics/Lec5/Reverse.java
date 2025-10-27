import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1);

        System.out.print("Reversed array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }

    // Recursive function to reverse array
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end)
            return; // base case

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverseArray(arr, start + 1, end - 1);
    }
}
