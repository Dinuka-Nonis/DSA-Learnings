// iterating over an array

public class ForLoop {
    public static void main (String[] args ) {
        int[] numbers= {10,20,30,40,50};

        for (int i =0 ; i<numbers.length ;i++) {
            System.out.println("Element at Index " + i + ": " + numbers[i] );
        }

        for (int num : numbers) {
            System.out.println("Number : " +num);
        }
    }
}
