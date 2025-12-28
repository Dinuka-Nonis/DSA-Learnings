public class Rotation_times {
    // Function to find rotation count using binary search
    public int findRotations(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Loop until low meets high
        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than element at high,
            // smallest element lies to the right of mid
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                // Smallest element is at mid or to the left
                high = mid;
            }
        }

        // low == high → index of smallest element
        return low;
    }


    public static void main(String[] args) {
        Rotation_times sol = new Rotation_times();
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        int rotations = sol.findRotations(arr);
        System.out.println(rotations);
    }
}
    

