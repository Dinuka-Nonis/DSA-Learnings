/*Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Examples:
Input(user gives value): 7

Output: 7

Input(user gives value): -5

Output: -5

*/




import java.util.Scanner;

class InputOutput {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputOutput s = new InputOutput();
        s.printNumber(sc);
    }
}