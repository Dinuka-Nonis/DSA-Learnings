/*
 * Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()
for C# : Console.WriteLine();
for Go : fmt.Println()

Examples:
Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90.

Input: marks = 14

Output: Fail

Explanation: marks are less than 35.
 */

import java.util.Scanner;

class IfElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 70){
            System.out.println("Grade B");
        }else if (marks >=50) {
            System.out.println("Grade C");
        }else if (marks>=35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }
    
}
