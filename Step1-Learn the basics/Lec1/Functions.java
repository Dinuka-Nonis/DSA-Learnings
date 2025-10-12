public class Functions {
    static void changevalue(int x) {
        x=100;  // changes only the copy.
    }
    static void changeArray(int[] arr) {
        arr[1] = 99;
    }
    
    public static void main(String[] args) {
        int a = 20;
        changevalue(a);
        System.out.println(a); // output : 20  - original is not changed.

        int[] numbers= {1,2,3};
        changeArray(numbers);
        System.out.println(numbers[0]);
        
        System.out.println(numbers[1]);
    }
}

/*
pass by value
In Java, all primitive types (int, float, double, char, boolean) are passed by value.

What it means: The method gets a copy of the variable. Changes inside the method do not affect the original variable.

pass by reference
 * Java does not support true pass by reference for primitives. But objects (like arrays, classes)
 *  are passed by reference in a sense that the method gets a reference to the object, so changes
 *  to the object inside the method will affect the original object.
 */