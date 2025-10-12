import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers (0 to stop):");

        number = sc.nextInt(); // first input
        while (number != 0) { // condition
            System.out.println("You entered: " + number);
            number = sc.nextInt(); // next input
        }

        System.out.println("Loop ended!");
    }
}

//Behavior:

//The loop continues until the user enters 0.

//Perfect example of unknown number of iterations.