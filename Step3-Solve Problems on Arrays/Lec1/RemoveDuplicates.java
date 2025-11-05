/*
 Question:
 Write a Java program to remove duplicates from a sorted integer array in-place and return the count of unique elements.
 The function should not use extra space and should modify the input array directly.

 Explanation:
 This program uses the two-pointer technique.
 - 'i' tracks the position of the last unique element.
 - 'j' scans through the array.
 Whenever a new unique element is found, it's moved to the next position after 'i'.
 The result is an array where the first 'k' elements are unique.
*/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicates obj = new RemoveDuplicates();
        int k = obj.removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
