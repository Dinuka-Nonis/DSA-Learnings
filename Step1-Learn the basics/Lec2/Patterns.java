
import java.util.Scanner;



public class Patterns {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a pattern to print.");
        System.out.println("1.Rectangular star pattern.");
        System.out.println("2.Right-Angled Triangle Pattern");
        int num = sc.nextInt();

        switch(num) {
            case 1 :
            System.out.println("Pattern 1 - Rectangular Star Pattern");
                for(int i = 0 ; i<5 ; i++){
                    for(int j=0 ; j < 5 ; j++){
                        System.out.print("* ");
                    }
                System.out.println();
            }
            case 2 :
            System.out.println("Right-Angled Triangle Pattern");
                for(int i = 0 ; i<5 ; i++){
                    for(int j=0 ; j < i ; j++){

                        System.out.print("* ");
                    }

                System.out.println();
            }
        }

        
    }
}
