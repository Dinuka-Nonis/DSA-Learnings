// PascalTriangle.java
public class PascalTriangle {
    // Function to compute element at (r, c)
    public long findPascalElement(int r, int c) {
        // Element is C(r-1, c-1)
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // Compute C(n, k) using iterative formula
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
    
    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
        int r = 5, c = 3;
        System.out.println("Element at (" + r + "," + c + ") = " + sol.findPascalElement(r, c));
    }
}
    

