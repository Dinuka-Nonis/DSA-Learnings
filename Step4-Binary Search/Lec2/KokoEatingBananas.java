// Approach: We use Binary Search on the answer (eating speed k). The minimum speed is 1 and the maximum is the largest pile.
// For a chosen speed k, we calculate how many hours Koko needs to eat all piles (using ceiling division).
// If total hours <= h, the speed is sufficient, so we try a smaller k; otherwise, we increase k.
// This works because higher speeds always reduce the required time (monotonic behavior).

import java.util.Arrays;

public class KokoEatingBananas {
    private int calculateTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += (int)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }
     public int minEatingSpeed(int[] piles, int h) {
        // Find maximum element
        int maxPile = Arrays.stream(piles).max().getAsInt();

        // Initialize low and high pointers
        int low = 1, high = maxPile;
        int ans = maxPile;

        // Binary search on answer space
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);

            // If possible, try smaller speed
            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }
            // Otherwise, try larger speed
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        KokoEatingBananas obj = new KokoEatingBananas();
        System.out.println(obj.minEatingSpeed(piles, h));
    }
}
