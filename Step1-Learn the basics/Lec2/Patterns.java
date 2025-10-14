
import java.util.Scanner;



public class Patterns {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a pattern to print.");
        System.out.println("1.Rectangular star pattern.");
        System.out.println("2.Right-Angled Triangle Pattern");
        System.out.println("3.Right-Angled Number Pyramid");
        System.out.println("4.Right-Angled Number Pyramid - II");
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
            case 3 :
            Scanner th = new Scanner(System.in);
            System.out.println("Height of the pyramid: ");
            int n = th.nextInt();
            System.out.println("Right-Angled Number Pyramid");

            
                for(int i = 0 ; i<n ; i++){
                    for(int j=0 ; j < i ; j++){

                        System.out.print(j+1);
                    }

                System.out.println();
            }
            case 4:
            
            Scanner t = new Scanner(System.in);
            System.out.println("Height of the pyramid: ");
            n = t.nextInt();
            System.out.println("Right-Angled Number Pyramid - II");
            
                for(int i=0 ; i<=n;i++){
                    for( int j =0 ; j<i ; j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }

        }

        
    }
}
